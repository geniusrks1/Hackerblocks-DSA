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

int heightOfBT(node* root)
{
	//Base Case
	if(!root)return 0;

	//Recursive Case
	int leftHeight=heightOfBT(root->left);
	int rightHeight=heightOfBT(root->right);

	return 1+max(leftHeight,rightHeight);
}

int main() {
    int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();
	cout<<heightOfBT(root)<<endl;
}

