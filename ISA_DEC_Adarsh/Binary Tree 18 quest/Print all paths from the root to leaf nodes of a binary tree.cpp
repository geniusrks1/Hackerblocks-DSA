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

void solve(node* root,vector<string> &ans,string s)
{
     if(!root)
         return;
        
    s = s+to_string(root->data);
    s = s+"->";
    if(!root->left && !root->right)
    {
       s.erase(s.length()-2);
       ans.push_back(s);
       return;
    }
             
        solve(root->left,ans,s);
        solve(root->right,ans,s);
    
}
vector<string> binaryTreePaths(node* root) {
    
    vector<string> ans;
    string s = "";
    
    if(root==NULL)
        return ans;
    
    solve(root,ans,s);
    
    return ans;
    
}




int main() {
node* root=buildLevelOrderBT();

vector<string> ans=binaryTreePaths(root);
for(string s: ans){

for(int i = 0; i < s.length(); i++){
			if(s[i] == '-'){
				if(i+1 < s.length() && s[i+1] == '>'){
					cout << " ";
					i += 1;
				}
				else
					cout << '-';
			}
			else
				cout << s[i];
		}
		cout << endl;
}
}
