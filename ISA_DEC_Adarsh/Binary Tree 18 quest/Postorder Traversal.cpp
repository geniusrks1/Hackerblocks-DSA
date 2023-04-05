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

void printPostOrder(node* root)
{
    if(root==NULL)return;

   
    printPostOrder(root->left);
    printPostOrder(root->right);
	cout<<root->data<<endl;
}

int main() {
    int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();

    printPostOrder(root);
    return 0;

}
