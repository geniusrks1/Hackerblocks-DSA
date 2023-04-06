#include<iostream>
using namespace std;
#include <bits/stdc++.h>

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

		node* root= new node(d);
		root->left= buildPreOrder();
		root->right= buildPreOrder();
		return root;
	}
	else return NULL;
}

void printPreOrder(node* root){
    if(root==NULL)return;

    cout<<root->data<<endl;
    printPreOrder(root->left);
    printPreOrder(root->right);
}

void printLevelOrderWise(node* root)
{
	if(!root)
	{
		cout<<"Tree is empty"<<endl;
		return;
	}

	//Tree exist
	queue<node*>q;
	q.push(root);
	
	while(!q.empty())
	{
		
		int sz=q.size();
		for(int i=0;i<sz;i++)
		{
			node* currNode=q.front();
			q.pop();

			cout<<currNode->data << " ";

			if(currNode->left)q.push(currNode->left);
			if(currNode->right)q.push(currNode->right);
		}

		cout<<endl;	

		
	}

}

int main() {
	int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();
printLevelOrderWise(root);

	return 0;
}
