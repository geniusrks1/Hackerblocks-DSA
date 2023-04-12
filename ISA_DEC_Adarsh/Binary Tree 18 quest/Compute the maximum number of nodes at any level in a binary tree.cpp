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

int printLevelOrderWise(node* root)
{
    int maxx=-1;
	if(!root)
	{
		
		return 0;;
	}

	//Tree exist
	queue<node*>q;
	q.push(root);
	
	while(!q.empty())
	{
		
		int sz=q.size();
        maxx=max(maxx,sz);
		for(int i=0;i<sz;i++)
		{
			node* currNode=q.front();
			q.pop();

		//	cout<<currNode->data << " ";

			if(currNode->left)q.push(currNode->left);
			if(currNode->right)q.push(currNode->right);
		}

		//cout<<endl;	

		
	}
    return maxx;

}

int main() {

    node* root=buildLevelOrderBT();
   
   int ans= printLevelOrderWise(root);
   cout<<ans<<endl;

	return 0;
}

