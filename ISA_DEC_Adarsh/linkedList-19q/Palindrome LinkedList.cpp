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

node* findMid(node* head){
	node* slow=head;
	node* fast=head;
	while(fast->next && fast->next->next){
		slow=slow->next;
		fast=fast->next->next;
	}
	return slow;
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

bool isPalindrome(node* head){
	node* midNode=findMid(head);
	// reverse 2nd half
	midNode->next=reverse(midNode->next);
	// check first half and second half
	node* p1=head;
	node* p2=midNode->next;
	while(p2){
		if(p1->data != p2->data) return false;
		p1=p1->next;
		p2=p2->next;
	}
	return true;
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
bool ans=isPalindrome(head);
cout<<boolalpha<<ans<<endl;

	return 0;
}
