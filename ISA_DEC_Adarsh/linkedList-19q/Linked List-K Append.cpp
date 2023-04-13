#include<bits/stdc++.h>
using namespace std;

class node
{
public:
    int data;
    node* next;

    //constructor
    node()
    {
        next=NULL;
    }
    node(int data)
    {
        this->data=data;
        this->next=NULL;
    }
};

void insertToTail(node* &head, int val)
{
    node* newNode=new node(val);
    if(!head)
    {
        head=newNode;
        return;
    }
    node* p=head;
    while(p->next)p=p->next;
    //p point to tail node
    p->next=newNode;
}


void printList(node* head)
{
    node* p=head;
    while(p)
    {
        cout<<p->data<<" ";
        p=p->next;
    }
    //cout<<endl;
}

 node* appendLastNToFirst(node* head, int k) {
         if (!head|| k == 0)
                return head;
		
        node* temp=head;
        int count=1;
        while(temp->next){  // length code // gives the last node reference
            temp=temp->next;
            count++;
        }
      k=k%count;
       node* temp1=head;

        for(int i=0;i<count-1-k;i++)
          temp1 = temp1->next;
        
        
        node* newHead=temp1->next;
        
        temp1->next=NULL;
        temp->next=head;
        return newHead;

}


node* checkList(node* head,int k,int n){

node* last = head;
int i=0;
k = k%n;
int ok = n-k-1;
while(last != NULL && i<ok){
last = last -> next;
i++;
}
node* second = last->next;
last->next = NULL;
return second;
}








int main()
{
    int n;
    cin>>n;
    node* head=NULL;
    for(int i=0;i<n;i++)
    {
        int ip;
        cin>>ip;
        insertToTail(head,ip);
    }
	int k;
	cin>>k;
	node* y=checkList(head,k,n);
	printList(y);
	printList(head);
}
