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
    public static Node findMiddle(Node head)
     {
    //Brute force approach
    //    int count=0;
    //    Node temp=head;
    //    while(temp!=null)
    //    {
    //     count++;
    //     temp=temp.next;
    //    }

    //    int mid=count/2;
    //    temp=head;
    //    for(int i=0;i<mid;i++)
    //    {
    //     temp=temp.next;
    //    }
    //    return temp;

    //Optimal approach
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null && slow!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    }
    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }
}
