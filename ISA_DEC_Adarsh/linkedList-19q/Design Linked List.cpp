#include <bits/stdc++.h>
using namespace std;

class Node {
public:
    int val;
    Node* next;
    Node(int val) {
        this->val=val;
        this->next=NULL;
    }
};


    /** Initialize your val structure here. */
    int size=0;
    Node* head=new Node(0);
   
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        int get(int index) {
        if(index>=size || index < 0) {
            return -1;
        }
        Node* current=head;
        for(int i=0;i<index;++i) {
            current= current->next;
        }
        return current->val;
    }

    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  

  void addAtIndex(int index, int val) {
       
        if (index>size || index < 0) {
            return;
        }
        Node* current= head;
        Node* new_node = new Node(val);
     
        if (index == 0) {
            new_node->next = current;
            head = new_node;
        }
        else {
           
            for(int i=0;i<index-1;++i) {
                current= current->next;
            }
           
            new_node->next = current->next;
            current->next = new_node;
        }
       
        size++;
    }

 void addAtHead(int val) {
        addAtIndex(0, val);
    }
 
    void addAtTail(int val) {
        addAtIndex(size, val);       
    }
    



void deleteAtIndex(int index) {
        if(index>=size || index < 0) {
            return;
        }
   
        if (index == 0) {
            Node* nextNode = head->next;
            delete head;
            head = nextNode;            
        }
        else {
            Node* current= head;
            for(int i=0;i<index-1;++i) {
                current= current->next;
            }
        
            Node* nextNode = current->next->next;
           
            delete current->next;
            current->next = nextNode;
        }
        // Decrease size whenever we delete node
            size--;
    }


int main() {

int n;
cin>>n;
 while (n--){
string s;
cin>>s;
if(s=="addAtHead"){
    int val;
    cin>>val;
   addAtHead(val);
}
else if(s=="addAtTail"){
    int val;
    cin>>val;
   addAtTail(val);
}
else if(s=="addAtIndex"){
    int index,val;
    cin>>index;
    cin>>val;
    addAtIndex(index,val);
}
else if(s=="get"){
    int index;
    cin>>index;
    cout<<get(index)<<" ";
}
else{
    int index;
    cin>>index;
    deleteAtIndex(index);
}
    
   
    
 }
 return 0; 
}


