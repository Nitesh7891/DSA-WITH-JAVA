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
    public static int LengthOfLoop(Node head)
    {
        //brute force approach
        // Map<Node,Integer> count=new HashMap<>();
        //  Node temp=head;
        //  int timer=1;
        //  while(temp!=null)
        //  {
        //     if(count.containsKey(temp))
        //     {
        //         int loopLength=timer-count.get(temp);
        //         return loopLength;
        //     }
        //     count.put(temp, timer);
        //     temp=temp.next;
        //   timer++;
        //  }
        //  return 0;

        //optimal approach
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                int looplength=1;
                Node temp=slow;
                while(temp.next!=slow)
                {
                 temp=temp.next;   
                 looplength++; 
                }
                   return looplength;
            }
           
        }
          return 0;
    }
    public static void main(String[] args) {
         Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a loop from fifth to second
        fifth.next = second;

        System.out.println(LengthOfLoop(head));


    }
}
