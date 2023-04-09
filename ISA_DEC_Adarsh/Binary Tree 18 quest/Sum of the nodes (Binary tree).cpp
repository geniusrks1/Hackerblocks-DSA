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

int main() {
    int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();

    int ans=allnodesSum(root);
	cout<<ans;
    return 0;

}
