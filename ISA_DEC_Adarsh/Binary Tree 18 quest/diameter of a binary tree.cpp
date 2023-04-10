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

pair<int,int>diamHelper(node* root)
    {
        //Base Case
        if(!root)return {0,0}; //{D,H}

        //Recursive Case
        pair<int,int>left=diamHelper(root->left);
        pair<int,int>right=diamHelper(root->right);

        //conclusion
        int dl=left.first;
        int dr=right.first;
        int LH=left.second;
        int RH=right.second;

        int dc=LH+RH; //longest path passing from currNode passing

        int D=max({dc,dl,dr});
        int H=1+max(LH,RH);

        return {D,H}; 
    }

    int diameterOfBinaryTree(node* root) {
        pair<int,int>ans=diamHelper(root); //pair<diameter,ht>
        return ans.first;
    }




int main() {
node* root=buildLevelOrderBT();
cout<<1+diameterOfBinaryTree(root);

}
