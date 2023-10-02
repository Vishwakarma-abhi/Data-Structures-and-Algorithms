
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class reverse_DLL {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.next = new Node(2);
        root.next.prev = root;
        root.next.next = new Node(3);
        root.next.next.prev = root.next;

        Node curr = root;

        System.out.println("original Linkedlist");
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.print("--> null");

        System.out.println("\nReversed LinkedList");

        Node rev = reverse(root);
        while (rev != null) {
            System.out.print(rev.data + " --> ");
            rev = rev.next;
        }
        System.out.print("--> null");
    }

    private static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        return head;

    }
}
