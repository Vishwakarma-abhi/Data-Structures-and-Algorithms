import java.io.*;
class Node
{
    int data;
    Node next;
    
}

public class insert_sorted {
    public static void main(String[] args) {
        insert_sorted list=new insert_sorted();
        Node head=new Node();
        list.sort_insert(head, 25);
        
        list.display(head);
        
    }

    public void sort_insert(Node head,int d)
    {
        Node newnode=new Node();
        newnode.data=d;
        if(head == null)
        {
            System.out.println("List is Empty new Element added");
            head=newnode;
        }
        if(d < head.data)
        {
            newnode.next=head;

        }
        Node trav=head;
        while(trav.next != null && trav.data < d )
        {
            trav=trav.next;

        }
        newnode.next=trav.next;
        trav.next=newnode;
    }
    public void display(Node head) 
    {
        Node n=head;          // temporary (Node) Object for travelling

        if(head==null)
        {
            System.out.println("Your Linked List is Empty");
        }
        else
        {
            System.out.println("\n\t Our Linked List is \t");
            while(n.next != null)
            {
                System.out.println(n.data);
                n=n.next;           // pointing to the next node
                
            }
            System.out.println(n.data);
        }
            
            
    }
    
}
