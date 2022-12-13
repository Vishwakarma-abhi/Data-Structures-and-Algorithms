/*Counting Nodes of LinkedList*/

import java.util.Scanner;

public class Count_nodes {
    Node head;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 5;
        Count_nodes List = new Count_nodes();
        while (i != 0) {
            List.insert();
            i--;
        }
        List.count();
    }

    void insert() {
        Node node = new Node();
        System.out.println("Enter data to create new node");
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

    void count() {
        int count = 0;
        while (head.next != null) {
            count++;
            head = head.next;
        }
        System.out.println("No. of nodes  in the list = " + (count + 1));
    }

}

class Node {
    int data;
    Node next;

}
