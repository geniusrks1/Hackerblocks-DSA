#include <iostream>
using namespace std;
class node{
    public:
    int data;
    node* next;

    node(int data){
        this->data=data;
        this->next=NULL;
    }
};

void insertToTail(node* &head, int val){
    node* newNode=new node(val);
    if(!head){
        head=newNode;
        return;
    }
 node* p=head;
 while(p->next) p=p->next;

 p->next=newNode;

}

void printList(node* head){
    node* p= head;
    while(p){
        cout<<p->data<<" ";
        p=p->next;
    }
    cout<<endl;
}

node* reverse(node* start, node* end){
    node* prev=NULL;
    node* curr=start;
    node* forw=NULL;
while(curr!=end){
    forw=curr->next;
    curr->next=prev;
    prev=curr;
    curr=forw;
}
return prev;
}

node* reverseInBetween(node* head, int i, int j){
    node* dummy=new node(-1);
    dummy->next=head;
    node* start=dummy;
    node* end=dummy;
    node* prev=NULL;

for(int x=0;x<i;x++){
    if(x==i-1)prev=start;
    start=start->next;
}

for(int x=0;x<j;x++){
    end=end->next;
}
end=end->next;
prev->next=reverse(start,end);
start->next=end;
return dummy->next;

}



int main() {
    int n;
    cin>>n;
    node* head=NULL;
    for(int i=0;i<n;i++)
    {
        int inp;
        cin>>inp;
        insertToTail(head,inp);
    }
    int i,j;
    cin>>i>>j;
    head=reverseInBetween(head,i,j);
    printList(head);
    return 0;
}
