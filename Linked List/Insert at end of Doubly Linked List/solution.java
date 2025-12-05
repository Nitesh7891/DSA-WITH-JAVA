class Node{
    int data;
    Node next;
    Node back;

    Node(int data,Node next,Node prev)
    {
        this.data=data;
        this.next=next;
        this.back=prev;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
public class solution {
    public static Node convertArr2DLL(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node prev=head;

        for(int i=1;i<arr.length;i++)
        {
          Node temp=new Node(arr[i],null,prev);
          prev.next=temp;
          prev=temp;
        }
        return head;
    }

    public static void printList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static Node insertAtTail(Node head,int data)
    {
       Node newNode=new Node(data);

       if(head==null) return newNode;

       Node tail=head;
       while(tail.next!=null)
       {
       tail=tail.next;
       }
       tail.next=newNode;
       newNode.back=tail;
       return head;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        Node head = convertArr2DLL(arr);
        printList(head);
        head=insertAtTail(head,10);
        printList(head);
    }
}
