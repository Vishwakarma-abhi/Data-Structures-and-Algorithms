import java.io.IOException;
import java.util.Scanner;

class stack_linked {

    static StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;

    }

    public static void push(int data) {
        StackNode newnode = new StackNode(data);
        if (root == null) {
            root = newnode;
        } else {
            StackNode temp = root;
            root = newnode;
            newnode.next = temp;
        }
    }

    public int pop() {
        int popped = 0;
        if (root == null) {
            System.out.println("No elements to delete");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public void peek() {

        if (root == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Element at the top of the Stack is  :" + root.data);
        }

    }

    public void display() {
        if (root == null) {
            System.out.println("Nothing to display");
        } else {
            StackNode trav = root;
            do {
                System.out.println(root.data);

            } while (trav != null);
        }
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        stack_linked s = new stack_linked();
        System.out.println("Stack ");
        s.push(5);
        s.push(7);
        s.push(8);
        s.push(10);
        s.push(15);
        s.push(25);
        s.display();

        int item = s.pop();
        System.out.println("Deleted item of the stack =" + item);
        System.out.println();
        System.out.println("Stack After deletion of the element");
        s.display();
        s.peek();
    }
}
