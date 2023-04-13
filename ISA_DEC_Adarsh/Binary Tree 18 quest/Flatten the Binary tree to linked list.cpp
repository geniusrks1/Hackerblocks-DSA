#include <bits/stdc++.h>
using namespace std;

class Node{
    public:
    int data;
    Node* left;
    Node* right;

    Node(int data){
        this->data=data;
        this->left=NULL;
        this->right=NULL;
    }

};

Node* buildTree(string str){
    if(str.length() == 0 || str[0] == 'N')
        return NULL;
    vector<string> ip;
    istringstream iss(str);
    for(string str; iss >> str; )
        ip.push_back(str);
    Node* root = new Node(stoi(ip[0]));
    queue<Node*> queue;
    queue.push(root);
    int i = 1;
    while(!queue.empty() && i < ip.size()) {
        Node* currNode = queue.front();
        queue.pop();
        string currVal = ip[i];
        if(currVal != "N") {
            currNode->left = new Node(stoi(currVal));
            queue.push(currNode->left);
        }
        i++;
        if(i >= ip.size())
            break;
        currVal = ip[i];
        if(currVal != "N") {
            currNode->right = new Node(stoi(currVal));
            queue.push(currNode->right);
        }
        i++;
    }
    return root;
}



Node* flattenHelper(Node* root){
        //Base Case
        if(!root)return NULL;

        //Recursive Case
        Node* left=flattenHelper(root->left);
        Node* right=flattenHelper(root->right);

        //operation
        if(!left)return root;
        //LST exist
        //find last element of flattened LST
        Node* p=left;
        while(p->right)p=p->right;
        //p pointed to last Node of flattened LST
        p->right=right;
        root->right=left;
        root->left=NULL;

        return root;
    }

    void flatten(Node* root) {
        flattenHelper(root);
        return;
        
    }



    void printpreOrder(Node* root){
    if(!root)return;

    cout<<root->data<<" ";
    printpreOrder(root->left);
	 
    printpreOrder(root->right);
}



int main() {


        string s;
        getline(cin,s);
        Node* root = buildTree(s);
        flatten(root);
    printpreOrder(root);

    return 0;
}
