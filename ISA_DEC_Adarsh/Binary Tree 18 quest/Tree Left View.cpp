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



void leftViewHelper(node* root, int level, vector<int>&ans)
{
	//Base Case
	if(!root)return;

	//Recursive Case
	if(level==ans.size())ans.push_back(root->data);

	leftViewHelper(root->left,level+1,ans);
	leftViewHelper(root->right,level+1,ans); 

}
void leftView(node* root)
{
	vector<int>ans;
	leftViewHelper(root,0,ans);
	for(auto x:ans)cout<<x<<" ";
	cout<<endl;	
}





int main() {
node* root=buildLevelOrderBT();
leftView(root);
}
