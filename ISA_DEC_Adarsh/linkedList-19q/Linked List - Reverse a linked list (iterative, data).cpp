#include<iostream>
using namespace std;
class node{
	public:
	int data;
	node* next;
	

	//constructor
	node(){
		next=NULL;
	}
	node(int data){
		this->data=data;
		this->next=NULL;
	}
};

void insertToTail(node* &head ,int val){
	node* newNode =new node(val);
	if(!head){
		head=newNode;
		return;
	}
	node* p=head;
	while(p->next)
	 p=p->next;

	p->next=newNode;
}

node* reverse(node* head){
	node* prev=NULL;
	node* curr=head;
	node* forw=NULL;
	while(curr){
		forw=curr->next;
		curr->next=prev;
		prev=curr;
		curr=forw;
	}
	return prev;
}

void printLL(node* head){
	node* p=head;
	while(p){
		cout<<p->data<<" ";
		p=p->next;
	}
	cout<<endl;
}

int main() {
	node* head=NULL;
	int n,x;
	cin>>n;
	while(n-->0){
		cin>>x;
		insertToTail(head,x);
	}
node* y=reverse(head);
printLL(y);

	return 0;
}
