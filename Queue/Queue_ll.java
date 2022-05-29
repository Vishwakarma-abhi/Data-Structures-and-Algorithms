import java.util.Scanner;

//Creation of QUEUE
class queue {

    int data;
    queue next;

    queue(int data) {
        this.data = data;
    }
}

class operation {

    queue front;
    queue rear;

    public void enqueue(int data) {
        queue newnode = new queue(data);
        if (front == null) {
            front = newnode;
            rear = newnode;
            front.next = rear.next = null;

        } else {
            rear.next = newnode;
            rear = newnode;
            rear.next = null;

        }
    }

    public int dequeue() {

        if (front == null && rear == null) {
            System.out.println("Underflow Condition");

        }
        int data = front.data;
        front = front.next;
        return data;
    }

    int peek() {
        if (front == null) {
            System.out.println("Empty Queue");
            return -1;
        } else {
            return front.data;
        }
    }

    public void display() {

        if (front == null) {
            System.out.println("Queue is Empty");

        } else {
            queue trav = front;
            while (trav != rear) {
                System.out.println(trav.data);
                trav = trav.next;

            }
        }
    }

}

// Driver Class
public class Queue_ll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        operation trav = new operation();
        trav.enqueue(9);
        trav.enqueue(5);
        trav.enqueue(25);
        trav.enqueue(8);

        trav.display();
        int data = trav.peek();
        if (data == -1) {
            System.out.println("Empty Queue");

        } else {
            System.out.println("Peek Element is  " + data);

        }
        int deleted_element = trav.dequeue();
        System.out.println("Deleted Element of the queue " + deleted_element);
        trav.display();

    }
}
