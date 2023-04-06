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

void printZigZag(node* root)
{
	if(!root)
	{
		cout<<"Tree is empty"<<endl;
		return;
	}

	//Tree exist
	queue<node*>q;
	q.push(root);
	int level=0;
	while(!q.empty())
	{
		vector<int>ans;
		int sz=q.size();
		for(int i=0;i<sz;i++)
		{
			node* currNode=q.front();
			q.pop();
			ans.push_back(currNode->data);

			if(currNode->left)q.push(currNode->left);
			if(currNode->right)q.push(currNode->right);
		}

		if(level%2==1)reverse(ans.begin(),ans.end());
		level++;

		for(auto x:ans)cout<<x<<" ";
	}
	cout<<endl;	
}





int main() {
	int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();
printZigZag(root);

	return 0;
}
