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
    public static boolean detectLoop(Node head)
    {  
        //Brute force approach
        Map<Node,Integer>map=new HashMap<>();
        while(head!=null)
        {
            if(map.containsKey(head))
            {
                return true;
            }
            else
            {
                map.put(head,1);
            }
            head=head.next;
        }
        return false;
        
        
        //optimal approach
        // Node slow=head;
        // Node fast=head;
        // while(slow!=null &&fast!=null &fast.next!=null)
        // {
        //     if(slow==fast)
        //     {
        //         return true;
        //     }
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // return false;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next = head.next;

        System.out.println(detectLoop(head));;
    }

}
