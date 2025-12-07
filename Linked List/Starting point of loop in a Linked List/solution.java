import java.util.*;

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
    public static Node detectCycle(Node head)
    {
       //Brute force approach
       Set<Node> visited=new HashSet<>();
       Node curr=head;
       while(curr!=null)
       {
              if(visited.contains(curr))
              {
                return curr;
              }
              visited.add(curr);
              curr=curr.next;

       }
       return null;

        ///optimal approach
        // Node slow=head;
        // Node fast=head;
        // while(fast!=null && fast.next!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     if(slow==fast)
        //       {
        //           slow=head;
        //     while(slow!=fast)
        //     {
        //         slow=slow.next;
        //         fast=fast.next;
        //     }
        //      return slow;
        //     }    
        // }
        //    return null;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        // Create cycle: last node connects to node with value 2
        head.next.next.next.next = head.next;
        System.out.println( detectCycle(head).data); // Output: 2
    }
}
