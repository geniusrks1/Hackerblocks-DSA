#include <bits/stdc++.h>
using namespace std;

class node{
    public:
    int data;
    node* left;
    node* right;

    node(int data){
        this->data=data;
        this->left=NULL;
        this->right=NULL;

    }
};

node* buildBTLvevelOrder(){

    int d;
    cin>>d;

    if(d==-1)return NULL;
    //tree exist

    node* root=new node(d);
    // queue<node>q;
    queue<node*>q; //queue is storing node pointer not node
    q.push(root);

    while(!q.empty())
    {
        // node curr=q.front();
        node* curr=q.front(); //we are storing node in heap memory so use that node by pointers
        q.pop();

        int c1,c2;
        cin>>c1>>c2;

        if(c1!=-1)
        {
            //left child exist
            curr->left=new node(c1);
            q.push(curr->left);
        }

        if(c2!=-1)
        {
            //right child exist
            curr->right=new node(c2);
            q.push(curr->right);
        }
    }
    return root;
}

int findMaxSum(node* root){
    // base case
    if(!root){
        return INT_MIN;
    }
    if(root->left==NULL && root->right== NULL){
        return root->data;
    }

    int leftAns=findMaxSum(root->left);
    int rightAns=findMaxSum(root->right);
    return root->data +max(leftAns,rightAns);
}






void f(node* root, int k, vector<int>&temp, vector<int>&ans){
if(!root)return;
if(ans.size()!=0)return;
if(root->left==NULL && root->right==NULL){
    if(k==root->data){
        temp.push_back(root->data);
        ans=temp;
        // backtracking
        temp.pop_back();
    }
    return;
} 
// recursion
 temp.push_back(root->data);
//  f(root, k- root->data, temp ,ans);
f(root->left,k-root->data,temp,ans);
//  f(root, k- root->data, temp ,ans);
f(root->right,k-root->data,temp,ans);
 // backtrack
 temp.pop_back();

}


vector<int>  maxSumPath(node* root, int k){

vector<int> ans;
vector<int> temp;

f(root, k, temp ,ans);
return ans;
}

void printLevelOrder(node* root)
{
    queue<node*>q;
    q.push(root);

    while(!q.empty())
    {
        node* temp=q.front();
        q.pop();

        cout<<temp->data<<" ";
        if(temp->left)q.push(temp->left);
        if(temp->right)q.push(temp->right);
    }
    cout<<endl;
}

int main() {
  node* root=buildBTLvevelOrder();
//   printLevelOrder(root); //aise debug kr kr k dekho kha tak execution sahi aa rhi hai
  int maxSum=findMaxSum(root);
//   cout<<maxSum<<endl;
  vector<int> ans=maxSumPath(root,maxSum);
    reverse(ans.begin(), ans.end());

for(int x: ans) cout<<x<<" ";


}
