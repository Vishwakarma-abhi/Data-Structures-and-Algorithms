class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class lengthOfLoop {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head;

        // loop present
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (fast != null && fast.next != null && slow != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // since the loop found
                count = 1;
                Node temp = fast;
                while (temp.next != fast) {
                    count++;
                    temp = temp.next;
                }
                break;
            }
        }
        System.out.println(count);
    }
}
