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

void printinOrder(node* root)
{
    if(root==NULL)return;

   
    printinOrder(root->left);
	 cout<<root->data<<endl;
    printinOrder(root->right);
}

bool StructurallyIdentical(node* p, node* q){


	    if(!p && !q)
        return true;
        else if(!p && q)
        return false;
         else if(p&& !q)
        return false;

	return StructurallyIdentical(p->left, q->left) && StructurallyIdentical(p->right, q->right);

}






int main() {
    int d1;
    cin>>d1;
    node* root1=new node(d1);
    root1->left=buildPreOrder();
    root1->right=buildPreOrder();



	int d2;
    cin>>d2;
    node* root2=new node(d2);
    root2->left=buildPreOrder();
    root2->right=buildPreOrder();

    bool ans=StructurallyIdentical(root1, root2);
	cout<<boolalpha<<ans;
    return 0;

}
