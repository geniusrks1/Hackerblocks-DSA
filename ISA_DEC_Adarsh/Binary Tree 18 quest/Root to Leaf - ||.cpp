#include<bits/stdc++.h>
using namespace std;


    map<long long,int>mp;
    int ans=0;
    long long csum=0;
    

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


    

void pathSumHelper(node* root, int tar, vector<int>&v, vector<vector<int>>&ans)
    {
        //Base Case
        if(!root)return;
        if(!root->left && !root->right)
        {
            if(root->data==tar)
            {
                v.push_back(root->data);
                ans.push_back(v);
                //Backtrack
                v.pop_back();
            }
            return;
        }

        //Recursive Case
        v.push_back(root->data);
        pathSumHelper(root->left,tar-root->data,v,ans);
        pathSumHelper(root->right,tar-root->data,v,ans);

        //Backtrack
        v.pop_back();
    }

    int pathSum(node* root, int tar) {
        vector<vector<int>>ans;
        vector<int>v; // v store root to curr Node at any state

        pathSumHelper(root,tar,v,ans);
       int x=ans.size();
        return x;    
    }


int main() {
node* root=buildLevelOrderBT();
int k;
cin>>k;
cout<< pathSum(root, k);

}
