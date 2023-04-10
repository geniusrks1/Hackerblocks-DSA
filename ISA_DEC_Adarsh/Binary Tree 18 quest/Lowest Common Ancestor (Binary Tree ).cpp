#include <bits/stdc++.h>
using namespace std;

class node{
    public:
    int data;
    node* left;
	node* right;

    node(int data){
        this->data=data;
        this->left=NULL;
        this->right=NULL;
    }
};

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


node* lowestCommonAncestor(node* root, node* p, node* q) {
        //Base Case
        if(!root)return NULL;
        if(root->data==p->data || root->data==q->data)return root;

        //Recursive case
        node* left=lowestCommonAncestor(root->left,p,q);
        node* right=lowestCommonAncestor(root->right,p,q);

        if(left && right)
        {
            //current node is LCA
            // partition point
            return root;
        }

        if(left)return left;
        if(right)return right;

        return NULL;    
    }


int main() {
    int d;
    cin>>d;
    node* root=new node(d);
    root->left=buildPreOrder();
    root->right=buildPreOrder();
	int a;
	int b;
	cin>>a>>b;
    node* p=new node(a);
	node* q=new node(b);

   node* ans=lowestCommonAncestor(root,p,q);
   cout<< ans->data ;
    return 0;

}
