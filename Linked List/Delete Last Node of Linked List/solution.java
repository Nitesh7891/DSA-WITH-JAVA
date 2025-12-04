class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}

public class solution {
    public static Node deleteLastNode(Node head)
    {
      if(head==null || head.next==null)
        return null;

      Node temp=head;
      while(temp.next.next!=null)
      {
        temp=temp.next;
      }

      temp.next=null;

      return head;
    }

    public static void printList(Node head){
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(11);
        head.next.next=new Node(12);
        head.next.next.next=new Node(13);
        deleteLastNode(head);
        printList(head);
    }
    
}
