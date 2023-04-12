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

 node* reverse(node* start, node* end)
    {
        node* prev=NULL, *curr=start, *next=NULL;
        while(curr!=end)
        {
            next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    node* reverseHelper(node* head, int k)
    {
        //Recursive Case
        node* start=head, *end=head;
        for(int i=0;i<k;i++)
        {
            if(!end)return head;
            end=end->next;
        }
        node* reversedHead=reverse(start,end);
        start->next=reverseHelper(end,k);
        return reversedHead;
    }

    node* reverseKGroup(node* head, int k) {
        return reverseHelper(head,k);

    }

int main() {
    int n,k;
    cin>>n>>k;
    node* head=NULL;
    for(int i=0;i<n;i++)
    {
        int inp;
        cin>>inp;
        insertToTail(head,inp);
    }

    head=reverseKGroup(head,k);
    printList(head);
    return 0;
}
