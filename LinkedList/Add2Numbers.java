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

public class Add2Numbers {
    public static void main(String[] args) {
        // Create the first linked list representing num1
        LinkedList list1 = new LinkedList();

        // Insert digits for num1 in reverse order
        list1.insert(1);
        list1.insert(2);
        list1.insert(3); // Represents the number 321 in reverse order

        // Create the second linked list representing num2
        LinkedList list2 = new LinkedList();

        // Insert digits for num2 in reverse order
        list2.insert(4);
        list2.insert(9);
        list2.insert(9); // Represents the number 654 in reverse order

        // Display the linked lists representing the numbers
        System.out.println("First Number (Linked List Form):");
        displayLinkedList(list1);

        System.out.println("Second Number (Linked List Form):");
        displayLinkedList(list2);

        // Now Logic of adding both the numbers
        int carry = 0;
        for (Node curr1 = list1.head, curr2 = list2.head; curr1 != null
                || curr2 != null || carry != 0;) {

            int x = (curr1 != null) ? curr1.data : 0;
            int y = (curr1 != null) ? curr2.data : 0;
            int sum = x + y + carry;
            carry = curr1.data / 10;

            int resultDigit = sum % 10;
            if (curr1 != null) {
                curr1.data = resultDigit;
                curr1 = curr1.next;
            } else {
                list1.insert(resultDigit);
            }
            if (curr2 != null) {
                curr2 = curr2.next;
            }
        }

        list1.head = reverse(list1.head);

        displayLinkedList(list1);
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

    // Helper method to display a linked list
    private static void displayLinkedList(LinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
