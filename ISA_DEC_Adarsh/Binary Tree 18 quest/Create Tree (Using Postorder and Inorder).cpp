#include<iostream>
using namespace std;
 int idx=0;
class node{
    public:
        int data;
        node*left;
        node*right;

        node(int d){
            data = d;
            left = NULL;
            right = NULL;
        }
};

node* buildHelper(int s, int e, int* in, int* post)
    {
        //Base Case
        if(s>e)return NULL;

        //Recursive Case
        //find root node
        int val=post[idx];
        idx--;

        int k=-1;
        for(int i=s;i<=e;i++)
        {
            if(in[i]==val)
            {
                k=i;
                break;
            }
        }

        node* root=new node(in[k]);
        //1st construct RST, bcz we traverse postorder in reverse way
        // so root,right,left in reverse way

        root->right=buildHelper(k+1,e,in,post);

        //2nd construct LST

        root->left=buildHelper(s,k-1,in,post);

        return root;
    }

void printStyle(node *root)
{
    if(root==NULL)
        return ;
    if(root->left==NULL)
        cout<<"END => ";
    else
        cout<<root->left->data<<" => ";
    cout<<root->data;    
    if(root->right==NULL)
        cout<<" <= END"<<endl;
    else
        cout<<" <= "<<root->right->data<<endl;
    printStyle(root->left);
    printStyle(root->right);

}
int main() {
	int n,m;
	cin>>n;
	int  post[n];
	for(int i=0;i<n;i++)
		cin>> post[i];
	cin>>m;
	int in[m];
	for(int i=0;i<m;i++)
		cin>>in[i];
		idx=m-1;
	node* root=buildHelper(0,m-1,in,post);
	printStyle(root);
	return 0;
}
