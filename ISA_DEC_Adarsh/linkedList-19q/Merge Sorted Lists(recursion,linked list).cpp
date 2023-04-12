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

 
 node* mergeTwoLists(node* l1, node* l2) {
        //Base Case
        if(!l1)return l2;
        if(!l2)return l1;

        //Recursive Case
        if(l1->data<=l2->data)
        {
            l1->next=mergeTwoLists(l1->next,l2);
            return l1;
        }
        else
        {
            l2->next=mergeTwoLists(l1,l2->next);
            return l2;
        }
        
    }

int main() {
    int n;
    cin>>n;
    node* head1=NULL;
    for(int i=0;i<n;i++)
    {
        int inp;
        cin>>inp;
        insertToTail(head1,inp);
    }
 int m;
    cin>>m;
    node* head2=NULL;
    for(int i=0;i<m;i++)
    {
        int inp;
        cin>>inp;
        insertToTail(head2,inp);
    }
    


node* head=mergeTwoLists(head1,head2);
    printList(head);
    return 0;
}
