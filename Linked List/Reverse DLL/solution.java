class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Node(int data,Node next,Node prev)
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

    public static Node reverseDLL(Node head)
    {
      Node back=null;
      Node temp=head;
      while(temp!=null)
      {
      Node front=temp.next;
      temp.next=back;
      back=temp;
      temp=front;
      }
      head=back;
      return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        printList(head);
         head=reverseDLL(head);
        printList(head);
    }
}
