//Singly Linked List

import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Linked_List {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Linkked List");
        System.out.println("____________________________\n");
        System.out.println("Let's Perform Single Linked List  ");

        while (true) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(
                    "Enter your choice -\n  1. creating a new node \n  2. Insert data at first postion \n  3. Insert from end \n 4 Display the list\n5. Insert at any posititon \n 6 delete front \n 7 delete back \n 8 delete at position ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    list.insert_end();
                    break;
                case 2:
                    list.insert_first();
                    break;
                case 3:
                    list.insert_end();
                    break;
                case 4:
                    list.display();
                    break;
                case 5:

                    list.insert_pos();
                    break;
                case 6:
                    list.delete_front();
                    break;
                case 7:
                    list.delete_back();
                    break;
                case 8:
                    list.delete_pos();
                    break;
                case 9:
                    list.dele_index();
                    break;
                default:
                    System.out.println("Not a Valid choice");

            }
        }
    }

}

// Node creation

class Node {
    int data;
    Node next; // reference

}

class Linkedlist {
    Linked_List list2 = new Linked_List();

    Scanner sc = new Scanner(System.in);
    Node head; // first node

    // Insertion at first
    public void insert_first() {
        Node node = new Node();
        System.out.println("Enter data to create new node");
        int d = sc.nextInt();
        node.data = d;
        node.next = head;
        head = node;
    }

    // Insertion at End
    public void insert_end() {
        Node node = new Node();
        System.out.println("Enter  data to create new node ");
        int d = sc.nextInt();
        node.data = d;
        node.next = null;

        if (head == null) {
            // first element is head i.e. node
            head = node;
        } else {

            // travelling to the end of the list
            Node n = head; // temporary (Node) Object for travelling
            while (n.next != null) {
                n = n.next; // pointing to the next node

            }
            n.next = node; // now after travelling n is pointing to the last node now the variable n
                           // now is of node is stored instead of null
        }
    }

    public void insert_pos() {
        Node node = new Node();
        System.out.println("Enter the position where you want to insert");
        int pos = sc.nextInt();
        System.out.println("Enter the data to be inserted");
        int d = sc.nextInt();
        node.data = d;
        Node trav = head;

        int i = 0;
        if (pos == 0) {
            node.next = head;
            head = node;
        } else {
            while (i != pos - 1) {
                trav = trav.next;
                i++;
            }
            node.next = trav.next;
            trav.next = node;

        }

    }

    // travesal and display
    public void display() {
        Node n = head; // temporary (Node) Object for travelling

        if (head == null) {
            System.out.println("Your Linked List is Empty");
        } else {
            System.out.println("\n\t Our Linked List is \t");
            while (n.next != null) {
                System.out.print(n.data);
                n = n.next; // pointing to the next node

            }
            System.out.print(n.data);
        }

    }

    // deleteing Process
    public void delete_front() {
        Node deleNode;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            deleNode = head;
            head = head.next;
            System.out.println("Deleted data is " + deleNode.data);
        }

    }

    public void delete_back() {
        Node deleNode;
        if (head == null) {
            System.out.println("List is Empty");
        }

        // checking if only one elememt is present
        else if (head.next == null) {
            deleNode = head;
            head = null;
            System.out.println("Only one element is present");
            System.out.println("Deleted data is " + deleNode.data);
        } else {
            Node last, prev = null;
            last = head;

            while (last.next != null) {

                prev = last;
                last = last.next;

            }

            deleNode = last; // last node is deleted
            prev.next = null; // Unlinking the last node

            System.out.println("Deleted data is " + deleNode.data);

            // two pointer approach can also be applied

        }

    }

    public void delete_pos() {
        Node deleNode, last, prev;
        if (head == null) {
            System.out.println("List is Empty");
        }

        System.out.println("Enter the data of the Node to be deleted ");
        int deledata = sc.nextInt();

        // checking at first position
        if (head.data == deledata) {
            deleNode = head;
            head = head.next;
            System.out.println("Deleted data is " + deleNode.data);
        }

        last = head.next;
        prev = head;
        while (last != null) {
            if (last.data == deledata) {
                deleNode = last;
                prev.next = last.next;
                System.out.println("Deleted data is " + deleNode.data);
            } else {
                last = last.next;
                prev = prev.next;
            }
        }

        System.out.println("Deleting data is not available in the list");

    }

    public void dele_index() {
        // two pointer approach
        Node p = head, q = head.next;
        System.out.println("Enter the index you want to delete");
        int index = sc.nextInt();
        for (int i = 0; i < index - 1; i++) {
            p = p.next;
            q = q.next;
        }
        p.next = q.next;

    }

}
