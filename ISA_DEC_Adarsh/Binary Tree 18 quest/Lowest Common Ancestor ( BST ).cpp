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

 int getLCA(node* root, int a, int b) {

if(!root)
   return -1;
 else  if(root->data==a || root->data==b)
   return root->data;
   else if (root->data<a && root->data<b)
   return getLCA(root->right,a,b);
 else if (root->data>a && root->data>b)
   return getLCA(root->left,a,b);

   else{
	   int ld=getLCA(root->left,a,b);
	   int rd=getLCA(root->right,a,b);
	   if(ld!=-1 && rd!=-1)
		   return root->data;
	   else if(ld!=-1)
	   return ld;
	   else
	   return rd;
   }
 }




    int main(){
	node* root=buildBST();
	int a,b;
	cin>>a>>b;
	int ans=getLCA(root,a,b);
	cout<<ans;
}
