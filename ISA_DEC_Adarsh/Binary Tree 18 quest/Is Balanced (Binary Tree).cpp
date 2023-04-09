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

void printinOrder(node* root)
{
    if(root==NULL)return;

   
    printinOrder(root->left);
	 cout<<root->data<<endl;
    printinOrder(root->right);
}
int allnodesSum(node* root){
	if(!root) return 0;
	return allnodesSum(root->left)+ allnodesSum(root->right)+ root->data ;
}


 pair<bool,int>isBalancedHelper(node* root)
    {
        //Base Case
        if(!root)return {true,0};

        //Recursive Case
        pair<bool,int>l=isBalancedHelper(root->left);
        pair<bool,int>r=isBalancedHelper(root->right);

        //conclusion
        bool isBalLeft=l.first, isBalRight=r.first;
        int LH=l.second, RH=r.second;
        int currHt=1+max(LH,RH);
        bool isCurBal=isBalLeft && isBalRight && abs(LH-RH)<=1;

        return {isCurBal,currHt};


    }

    bool isBalanced(node* root) {
        pair<bool,int>ans=isBalancedHelper(root); //pair<isBalanced,height>
        return ans.first;
    }



int main() {
    int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();

    bool ans=isBalanced(root);
	 cout << boolalpha <<ans;
    return 0;

}
