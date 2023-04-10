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

   node(int x, node *left, node *right) 
   {
 this->data=x;
  this->left=left;
  this->right=right;
   } 

};

node* buildPreOrder(){
    string s;
    cin>>s;
    if(s=="true"){
        int d;
        cin>>d;

        node* root=new node(d);
        root->left=buildPreOrder();
        root->right=buildPreOrder();
        return root;
    }
    else return NULL;
    
}

node* addOneRow(node* root, int v, int d){
        if(d==1 && root){
            node* nr = new node(v, root, NULL);
            return nr;
        }
        if(d==2 && root){
            node* nl = new node(v, root->left, NULL);
            node* nr = new node(v, NULL, root->right);
            root->left=nl;
            root->right=nr;
            return root;
        }
        if(!root){
            return NULL;
        }
        addOneRow(root->left, v, d-1);
        addOneRow(root->right, v, d-1);
        return root;
    }

void printStyle(node *root)
{
    if(root==NULL)
        return ;
    if(root->left==NULL)
       cout<<" <- ";
    else
        cout<<root->left->data<<" <- ";
    cout<<root->data;    
    if(root->right==NULL)
        cout<<" -> "<<endl;
    else
        cout<<" -> "<<root->right->data<<endl;
    printStyle(root->left);
    printStyle(root->right);

}

int main() {
    int d1;
    cin>>d1;
    node* root=new node(d1);
    root->left=buildPreOrder();
    root->right=buildPreOrder();
	
int v,d;
cin>>v>>d;

node* ans= addOneRow(root, v, d);
printStyle(ans);


    return 0;

}
