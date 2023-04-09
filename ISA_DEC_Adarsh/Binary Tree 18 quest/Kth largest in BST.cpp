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
		left=NULL;
		right=NULL;
	}
};

node* insertNodeToBST(node* root, int val)
{
	//Base Case
	if(!root)return new node(val);

	//Recursive Case
	if(root->data<val)root->right=insertNodeToBST(root->right,val);
	else root->left=insertNodeToBST(root->left,val);
	 

	return root;
}

node* buildBST()
{
	int n;
	cin>>n;

	node* root=NULL;
	for(int i=0;i<n;i++)
	{
		int input;
		cin>>input;

		root=insertNodeToBST(root,input);
	}
	return root;
}


void KthLargestELementHelper(node* root, int k, int &cnt, int &ans)
{
	//Base Case
	if(!root)return;

	//Recursive Case
	// reverse inorder traversal
	KthLargestELementHelper(root->right,k,cnt,ans);

	if(ans!=INT_MAX)return;
	//still kth smallest did not found
	cnt++;
	if(cnt==k)
	{
		ans=root->data;
		return;
	}	

	KthLargestELementHelper(root->left,k,cnt,ans);	
}

int KthLargest(node* root, int k)
{
	int ans=INT_MAX;
	int cnt=0;
	KthLargestELementHelper(root,k,cnt,ans);
	return ans;	
}




int main()
{
	node* root=buildBST();

	//Kth Largest Element
	int k1;
	cin>>k1;
	cout<<KthLargest(root,k1)<<endl;
}
