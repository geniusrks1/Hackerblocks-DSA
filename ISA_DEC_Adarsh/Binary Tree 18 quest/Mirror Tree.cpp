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


  bool chkIteratively(node* leftChild, node* rightChild)
    {
        queue<node*>q1,q2;
        q1.push(leftChild);
        q2.push(rightChild);

        while(!q1.empty() && !q2.empty())
        {
            node* p1=q1.front();
            q1.pop();
            node* p2=q2.front();
            q2.pop();

            if(!p1 && !p2)continue;
            if(!p1 || !p2)return false;
            if(p1->data!=p2->data)return false;

            //child compare==>is mirror of each other or not
            q1.push(p1->left);
            q1.push(p1->right);

            q2.push(p2->right);
            q2.push(p2->left);

        }
        return true;
    }

    bool isSymmetric(node* root) {
        if(!root)return true;
        bool chk=chkIteratively(root->left,root->right);
        return chk;
    }



int main(){
node* root=buildLevelOrderBT();
if(isSymmetric(root))
cout<<"YES"<<endl;
else
cout<<"NO"<<endl;

return 0;
}
