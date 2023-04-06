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

void topView(node* root)
{
	if(!root)
	{
		cout<<"Tree is empty"<<endl;
		return;
	}

	queue<pair<node*,int>>q; //queue<currnode,currLevel>
	q.push({root,0});

	map<int,int>mp; //map<level,topMostnode>

	while(!q.empty())
	{
		auto temp=q.front();
		q.pop();
		node* currnode=temp.first;
		int currLevel=temp.second;

		if(!mp.count(currLevel))mp[currLevel]=currnode->data;

		if(currnode->left)q.push({currnode->left,currLevel-1});
		if(currnode->right)q.push({currnode->right,currLevel+1});
	}

	for(auto x:mp)
	{
		cout<<x.second<<" ";
	}
	cout<<endl;
}




int main() {
node* root=buildLevelOrderBT();
topView(root);
}
