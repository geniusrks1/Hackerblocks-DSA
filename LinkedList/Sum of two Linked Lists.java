import java.util.*;

class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	} 
}

public class LinkedList {

 public static void main(String []args){
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int m=s.nextInt();
	Node head1=createLInkedList(n);
	Node head2=createLInkedList(m);
    Node heada=rev(head1);
	Node headb=rev(head2);
	Node revansHead =addTwoNumbers(heada,headb);
	
Node ansHead=rev(revansHead);
printLinkedList(ansHead);

 }

 public static Node addTwoNumbers(Node l1, Node l2) {
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;

int val=l1.data+l2.data;
Node head=new Node(val%10);
Node tail=head;
int carry=val/10;
l1=l1.next;
l2=l2.next;
while(l1!=null && l2!=null){
    int num=l1.data+l2.data+carry;
    tail.next=new Node(num%10);
    tail=tail.next;
    carry=num/10;
    l1=l1.next;
    l2=l2.next;
}

while(l1!=null){
    int num=l1.data+carry;
    tail.next=new Node(num%10);
    tail=tail.next;
    l1=l1.next;
    carry=num/10;
}
while(l2!=null){
    int num=l2.data+carry;
    tail.next=new Node(num%10);
    tail=tail.next;
    l2=l2.next;
    carry=num/10;
}
if(carry!=0)
tail.next=new Node(carry);

return head;
      
    }



 public static Node rev(Node head){
	 Node curr=head;
	 Node prev=null;
	 Node forw=null;
	 while(curr!=null){
		 forw=curr.next;
		 curr.next=prev;
		 prev=curr;
		 curr=forw;
	 }
	 return prev;
 }

public static Node createLInkedList(int n){
 Scanner s=new Scanner(System.in);
 Node head=null;
 Node tail=null;
 while(n-->0){
	 int data=s.nextInt();
	 Node newnode=new Node(data);
	 if(head==null){
		 head=newnode;
		 tail=newnode;
	 }
	 else{
		 tail.next=newnode;
		 tail=tail.next;
	 }
 }
return head;

}
public static void printLinkedList(Node head){
	Node temp=head;
	while(temp!=null){
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}

}
