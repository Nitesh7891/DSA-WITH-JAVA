class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data,Node next,Node back)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class solution {
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void DeletelastNode(Node head)
    {
        Node temp=head;
      while(temp.next!=null)
      {
        temp=temp.next;
      }

      temp.prev.next=null;
     
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.prev=head;
        head.next.next=new Node(30);
        head.next.next.prev=head.next;
        DeletelastNode(head);
        printList(head);
    }
    
}
