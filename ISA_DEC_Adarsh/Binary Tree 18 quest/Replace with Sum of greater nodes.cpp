#include<bits/stdc++.h>
using namespace std;
int sum=0;
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



node* buildPreOrder(){
    string s;
    cin>>s;
    if(s=="true"){
        int d;
        cin>>d;

        node* root=new node(d);
        root->left=buildPreOrder();
        root->right=buildPreOrder();
        return root;
    }
    else return NULL;
    
}



 int replace(node* root ,int sum){
        if(!root){
            return 0;
        }
        
        int right = replace(root->right ,sum);
        int rootdata = root->data;
        root->data = root->data + right + sum;
        int left = replace(root->left ,root->data);
        
        return rootdata + right + left;
        

	}

 void replaceWithLargerNodesSum(node* root) {
		if(!root){
            return;
        }
        int ans = replace(root ,0);
	}

void printPreOrder(node* root)
{
	//base Case
	if(!root)return;

    cout<<root->data<<" ";
	printPreOrder(root->left);
	printPreOrder(root->right);
	
}

node * buildAHeightBalancedBSTFromAnArray( int *a , int si , int ei ) {
	if ( si > ei ) {
		return NULL;
	}

	int mid = ( si + ei ) / 2;
	node *root = new node( a[mid] );

	node *leftHead = buildAHeightBalancedBSTFromAnArray( a , si , mid - 1 );
	node *rightHead = buildAHeightBalancedBSTFromAnArray( a , mid + 1 , ei );

	root->left = leftHead;
	root->right = rightHead;

	return root;
}


void replaceEachNodeWithSumOfGreaterThanEqualNodes( node *root ) {
	if ( root == NULL ) {
		return ;
	}

	replaceEachNodeWithSumOfGreaterThanEqualNodes( root->right );

	root->data += sum;
	sum = root->data;

	replaceEachNodeWithSumOfGreaterThanEqualNodes( root->left );
}




int main()
{
	
 int n;
 int in[1005];

	cin >> n;
	for ( int i = 0 ; i < n ; i++ ) {
		cin >> in[i];
	}

	node *root = buildAHeightBalancedBSTFromAnArray( in , 0 , n - 1 );

//replaceWithLargerNodesSum(root);
replaceEachNodeWithSumOfGreaterThanEqualNodes(root);
printPreOrder(root);
}
