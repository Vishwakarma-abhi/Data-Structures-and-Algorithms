import java.util.Scanner;
import java.io.*;

public class DLL {
    public static void main(String[] args) {
        

        DoubleLinkedlist list=new DoubleLinkedlist();
        
        Scanner sc=new Scanner(System.in);
        //inserting values in the linked llist
        int choice,num;
        System.out.println("Welcome to Double Linked List");
        System.out.println("-----------------------------");
        System.out.println("Let's perform DLL Operations");

        while(true)
        {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Enter your choice \n-----------------------------\n  1. creating a new node \n-----------------------------\n  2. Insert data at first \n-----------------------------\n  3. Insert from end \n-----------------------------\n 4.Deleting from (first) \n -----------------------------\n 5. Deleting from end \n 6. Display");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    
                    System.out.println("Enter a number to create new node");
                    num=sc.nextInt();
                    list.insert_end(num);
                    break;
                case 2:
                    
                    System.out.println("Enter a number to insert from first");
                    num=sc.nextInt();
                    list.insert_first(num);
                    break;
                case 3:
                    System.out.println("Enter a number to insert from end");
                    num=sc.nextInt();
                    list.insert_end(num);
                    break;
                case 4:
                    System.out.println("Deletion Under preocess");
                    list.delete_first();
                    break;
                
                case 5:
                    list.delete_end();
                    break;
                
                case 6:
                    list.display();
                    break;
                
                default :
                    System.out.println("Not a Valid choice");
    
            }
            

        }
        
        
    }
    
}
class Node
{
    int data;
    Node next;   //reference
    Node prev;
    
}
class DoubleLinkedlist{
    Node head;

    public void insert_first(int d)
    {
        Node node=new Node();
        node.data=d;
        node.prev=null;

        if(head == null)
        {
            //first element is head i.e. node 
            node.next=null;
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }

    public void insert_end(int d)
    {
        Node node=new Node();
        node.data=d;
        node.next=null;

        if(head == null)
        {
            //first element is head i.e. node 
            node.prev=null;
            head=node;
        }
        else{
            Node n=head;
            while (n.next !=null) {
                n=n.next;

                
            }
            n.next=node;                   //storing the address of new node to the (next) of the end node
            node.prev=n.next;
        }
    }
 
    public void delete_first()
    {
        if(head== null)
        {
            System.out.println("List is Empty Deletion not possible");
        }
        if(head.next == null)
        {
            System.out.println("Only One Element");
        }
        else{
            head=head.next;
            head.prev=null;

          
        }


    }

    public void delete_end()
    {
        Node curr=head;

        if(head == null)
        {
            System.out.println("List is Empty");
        }

        if(head.next == null)
        {
            System.out.println("List is Empty");
        }

        while(curr.next != null)
        {
            curr=curr.next;
        }
        curr.prev.next=null;
        System.out.println("Deletion successful ");


    }

    public void display() 
        {
            if(head==null)
            {
                System.out.println("List is Empty");
            }
            else{
                Node n=head;          // temporary (Node) Object for travelling
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