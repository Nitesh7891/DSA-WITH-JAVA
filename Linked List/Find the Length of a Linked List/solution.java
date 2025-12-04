class Node{
    int data;
    Node next;

    Node (int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class solution {
    public static int lengthOfLinkedList(Node head)
    {
        int length=0;
        Node temp=head;
        if(head==null) return length;
        if(head.next==null) return 1;

        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        return length;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        System.out.println(lengthOfLinkedList(head));
    }
}
