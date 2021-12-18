class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}

public class Circular_list {
    public static void main(String[] args) {
        Circular_list list=new Circular_list();
        Node head=new Node(10);
        head.next=new Node(5);
        head.next.next=new Node(20);
        head.next.next.next=new Node(15);
        head.next.next.next.next=head;

        list.traversal(head);
        list.insert_begin(head, 52);
        list.insert_end(head, 29);
        list.traversal(head);
        list.delete_begin(head);
        list.traversal(head);
        list.delete_kth(head, 2);
        list.traversal(head);
    }

    void traversal(Node head)
    {
        if(head == null)
        {
            System.out.println("list is Empty");
        }
        Node temp=head;
        do
        {
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp != head);
    }

    /*Naive Solution
    void begin(Node head,int d)
    {
        Node newnode=new Node(d);
        newnode.data=d;
        if(head == null)
        {
            System.out.println("List is Empty");
            System.out.println("New Element inserted");
            newnode.next=newnode;
        }
        else{
            Node trav=head;
            while(trav.next != head)
            {
                trav=trav.next;
            }
            trav.next=newnode;
            newnode.next=head;
            System.out.println("Insertion Successfull");
        }
    }*/


    //Efficient Solution in Big O (n) complexity
    public void insert_begin(Node head,int d)
    {
        Node newnode=new Node(d);
        if(head == null)
        {
            System.out.println("List is Empty");
            System.out.println("New Element inserted");
            newnode.next=newnode;
        }
        else{
            newnode.next=head.next;
            head.next=newnode;
            //swapping
            int t=head.data;
            head.data=newnode.data;
            newnode.data=t;
            System.out.println("Insertion Successfull from top");
        }

    }

    public void insert_end(Node head,int d)
    {
        Node newnode=new Node(d);

        if(head == null)
        {
            System.out.println("List is Empty");
            System.out.println("New Element is added successfully");
            newnode.next=newnode;
        }

        Node temp=head;
        while(temp.next != head)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
        System.out.println("Insertion from the end done");
    }
    
    public void delete_begin(Node head)
    {
        if(head == null)
        {
            System.out.println("No Element Found");
            
        }
        if(head.next == head)
        {
            head.next=null;
        }
        //Big O(1) 
        head.data=head.next.data;
        head.next=head.next.next;
        System.out.println("Top Element deleted");
    }

    public void delete_kth(Node head,int k)
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        if(head.next == head)
        {
            System.out.println("Only Element found and Deleted");
            head.next=null;
        }

        int c=0;
        Node trav=head;

        while(trav.next != head)
        {
            ++c;
            if(k == c)
            {
                trav.next=head.next.next;
            }

            head=head.next;
        }
    }

    
}
