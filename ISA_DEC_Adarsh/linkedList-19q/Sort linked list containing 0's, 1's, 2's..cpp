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

void insertToTail(node* &head, int data)
{
    node* newNode=new node(data);
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
    cout<<endl;
}
node* sortLinkedList(node* head){

	node* temp0 = new node(0);
    node* temp1 = new node(0);
    node* temp2 = new node(0);

  node* ptr0 = temp0;
  node* ptr1 =temp1;
  node* ptr2 = temp2;
  node* current =head;

    while (current) {
        if (current->data == 0) {
            ptr0->next = current;
            ptr0 = ptr0->next;
            current = current->next;
        } 
		else if (current->data == 1) {
            ptr1->next = current;
            ptr1 = ptr1->next;
            current = current->next;
        } 
		else {
            ptr2->next = current;
            ptr2 = ptr2->next;
            current = current->next;
        }
    }
    // connect the 2 linked lists.
    ptr0->next = (temp1->next)? (temp1->next) : (temp2->next);
    ptr1->next = temp2->next;
    ptr2->next = NULL;


 // Updating the head
    head = temp0->next;
    // Deletion of dummy nodes
    delete temp0;
    delete temp1;
    delete temp2;


    return head;




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


node* ans= sortLinkedList(head);
printList(ans);




}
