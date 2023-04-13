#include<bits/stdc++.h>
using namespace std;

class Node
{
public:
	int data;
	Node* left;
	Node* right;

	//constructor
	Node(int data)
	{
		this->data=data;
		Node* left=NULL;
		Node* right=NULL;
	}
};

Node* buildBTPreOrderWise()
{
	string d;
	cin>>d;


	if(d=="NULL")return NULL;

	//Node exist
	Node* root=new Node(stoi(d));
	root->left=buildBTPreOrderWise();
	root->right=buildBTPreOrderWise();

	return root;
}


int maxSum=-10000;
   

 int maxSumHelper(Node* root) {
		
		// base case
        if (!root) return 0;

        int leftAns = maxSumHelper(root->left);
        int rightAns = maxSumHelper(root->right);


        int ans1 = max(leftAns, rightAns);
        int ans2 = max(root->data, (root->data + ans1));
        int ans3 = max(ans2, leftAns + rightAns + root->data);
		
        maxSum = max(maxSum, ans3);
		
	
        return ans2;
    }


  int maxPathSum(Node* root) {
        
         maxSumHelper(root);
        return maxSum; 
        }



int main()
{
	Node* root=buildBTPreOrderWise();

	cout<< maxPathSum(root);
}

