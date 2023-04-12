#include<bits/stdc++.h>
using namespace std;

class node
{
public:
	int data;
	node* left, *right;

	node(int data)
	{
		this->data=data;
		this->left=NULL;
		this->right=NULL;
	}
};

node* buildLevelOrderBT()
{
	int d;
	cin>>d;

	if(d==-1)return NULL;
	//tree exist

	node* root=new node(d);
	queue<node*>q;
	q.push(root);

	while(!q.empty())
	{
		node* curr=q.front();
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


void verticalOrderTraversing(node* root){
    if(!root)return;
    queue<pair<node*,int>>q;
    q.push({root,0});
    map<int,vector<int>>mp;
   while(!q.empty())
	{
		auto temp=q.front();
		q.pop();
		node* currNode=temp.first;
		int verticalLevel=temp.second;

		mp[verticalLevel].push_back(currNode->data);

		if(currNode->left)q.push({currNode->left,verticalLevel-1});
		if(currNode->right)q.push({currNode->right,verticalLevel+1});
	}

	for(auto x:mp)
	{
		for(auto y:x.second)
		{
			cout<<y<<" ";
		}
		cout<<endl;
	}
}

int main(){
node* root=buildLevelOrderBT();
verticalOrderTraversing(root);
}
