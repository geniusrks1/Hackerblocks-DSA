#include<iostream>
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




node* leafDelete(node* root)
{
    if (!root)
        return NULL;
    if (!root->left  && !root->right ) {
        free(root);
        return NULL;
    }
 
    // Else recursively delete in left and right
    // subtrees.
    root->left = leafDelete(root->left);
    root->right = leafDelete(root->right);
 
    return root;
}



void printStyle(node *root)
{
    if(root==NULL)
        return ;
    if(root->left==NULL)
        cout<<"END => ";
    else
        cout<<root->left->data<<" => ";


    cout<<root->data;    

    if(root->right==NULL)
        cout<<" <= END"<<endl;
    else
        cout<<" <= "<<root->right->data<<endl;

		
    printStyle(root->left);
    printStyle(root->right);

}

int main() {
	  int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();

node* ans=leafDelete(root);
printStyle(ans);
	return 0;
}
