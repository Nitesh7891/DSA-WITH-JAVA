class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class solution {
    public static boolean searchElementInLL(Node head,int key)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
       public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        System.out.println(searchElementInLL(head, 3));
       }
}
