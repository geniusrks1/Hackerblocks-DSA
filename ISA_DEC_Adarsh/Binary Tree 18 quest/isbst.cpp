//Determine whether a given binary tree is a BST or not
#include <iostream>
#include <queue>
#include<climits>
#include<map>
#include <stack>
using namespace std;

class Node{
public:
	int data;
	Node *left;
	Node* right;
	Node()
	{
		left = NULL;
		right = NULL;
	}
	
	Node(int n){
		data = n;
		left = NULL;
		right = NULL;
	}
	// friend ostream& operator<<(ostream& writer, Node * root);
};

Node* levelOrderInput(){
    int root_val; 
    cin>>root_val;
    Node* root = new Node(root_val);
    queue<Node*> qu;    
    qu.push(root);
    while(!qu.empty()){
        Node* child = qu.front();
        qu.pop();
        int a,b; 
        cin>>a>>b;
        if(a != -1){
           Node* n = new Node(a);
           qu.push(n);
           child->left = n;
        }
        if(b != -1){
            Node* n = new Node(b);
            qu.push(n);
            child->right = n;
        }
    }
    return root;
}



bool isBST(Node* root, int minKey, int maxKey){

if(!root)
return true;

else if(root->data>minKey && root->data<=maxKey)
return isBST(root->left,minKey,root->data-1) && isBST(root->right,root->data,maxKey);
else
return false;
}


 bool isBST(Node* root) {
 return isBST(root, INT_MIN, INT_MAX);
}

int main(){
	Node *root = levelOrderInput();
    cout<<boolalpha<<isBST(root)<<endl;
}
