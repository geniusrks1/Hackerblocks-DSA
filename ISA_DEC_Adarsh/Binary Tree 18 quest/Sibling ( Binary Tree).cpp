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

void  notHavingsibling(node* root){
// Base case
    if (!root )
      return;
 
    
    if (root->left && root->right ){
        notHavingsibling(root->left);
        notHavingsibling(root->right);
    }
 
    else if (root->right ){
        cout << root->right->data << " ";
        notHavingsibling(root->right);
    }
 
   
    else if (root->left){
        cout << root->left->data << " ";
        notHavingsibling(root->left);
    }
}



int main() {
    int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();

    notHavingsibling(root);
    return 0;

}
