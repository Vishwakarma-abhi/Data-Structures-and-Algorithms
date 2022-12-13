
import java.util.*;

public class middle_item {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            insert_end();
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

    public void middle_element() {
        if (head == null) {
            System.out.println("List is empty");
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            // fast pointer taking 2x jump
            fast = fast.next.next;
            // slow pointer takees x jump
            slow = slow.next;
        }
        System.out.println("Middle Elelment of the linked List" + slow.data);

    }

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

    public void display() {
        Node n = head; // temporary (Node) Object for travelling

        if (head == null) {
            System.out.println("Your Linked List is Empty");
        } else {
            System.out.println("\n\t Our Linked List is \t");
            while (n != null) {
                System.out.print(n.data + "\n");
                n = n.next; // pointing to the next node

            }
            System.out.print(n.data);
        }

    }

}
