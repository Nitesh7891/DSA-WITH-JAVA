class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}

public class solution {

    public static Node mergeLinkedList(Node head1,Node head2){
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                tail.next=head1;
                head1=head1.next;
            }
            else{
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        if(head1!=null) tail.next=head1;
        else tail.next=head2;
        return dummy.next;
    }

    public static void main(String[] args) {
       Node head1=new Node(2);
         head1.next=new Node(5);
            head1.next.next=new Node(7);
               head1.next.next.next=new Node(10);

               Node head2=new Node(1);
            head2.next=new Node(3);
            head2.next.next=new Node(6);
               head2.next.next.next=new Node(8);
               head2.next.next.next.next=new Node(9);

              Node head= mergeLinkedList(head1, head2);
              while(head!=null){
                System.out.println(head.data);
                head=head.next;
              }
    }
}