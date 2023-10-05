
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node curr = head;

            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(data);
        }
    }
}

public class Add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a Linked List
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.println("Given Number");
        while (list.head != null) {
            System.out.print(list.head.data + " ");
            list.head = list.head.next;
        }

        // Adding 1 Steps
        // First reverse the linkedlist
        list.head = reverse(list.head);

        // initially we think that carry is 1 i.e in the last digit it is 9
        // because we have to add 1
        int carry = 1;

        for (Node curr = list.head; curr != null && carry == 1; curr = curr.next) {

            curr.data += carry;
            carry = curr.data / 10;
            curr.data = curr.data % 10;

        }
        list.head = reverse(list.head);
        // Now we have to check if any last carry is remaining or not
        while (carry == 1) {
            Node newNode = new Node(carry);
            newNode.next = list.head;
            list.head = newNode;
        }
        System.out.println(list.head.data);
        while (list.head != null) {
            System.out.print(list.head.data);

        }
    }

    private static Node reverse(Node head) {

        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
