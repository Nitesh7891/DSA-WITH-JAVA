class Node{
    int data;
    Node next;

    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class solution {

    public static Node insertAtHead(Node head,int data)
    {
       Node node=new Node(data,head);
       return node;
    }

    public static void printList(Node head){
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(12);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head=insertAtHead(head, 14);
        printList(head);
    }
}
