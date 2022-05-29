
import java.io.*;
import java.util.*;

class queue {
    int Que[];
    int front, rear, len;

    queue(int size) {
        Que = new int[size];
        front = 0;
        rear = -1;
        len = size;
    }

    void enqueue(int value) {
        if (rear == len - 1) {
            System.out.println("OverFlow");
        } else {
            Que[++rear] = value;
        }
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -9;
        } else if (front == rear) {
            front = rear = -1;
            return -9;
        } else {
            return Que[front++];
        }
    }

    void peek() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Peek Element " + Que[front]);
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("No Data found to display");
            return;
        } else {
            System.out.println();
            for (int i = front; i <= rear; i++) {
                System.out.println(Que[i]);
            }

        }
    }

}

// Queue data structure
public class Queuee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue que = new queue(10);
        System.out.println("\n");
        System.out.println("Queue");
        // Adding elements in the queue
        que.enqueue(5);
        que.enqueue(7);
        que.enqueue(9);
        que.enqueue(11);
        que.enqueue(8);

        // quueue before deletion process
        que.display();
        que.peek();
        int item = que.dequeue();
        System.out.println();
        System.out.println("Deleted element of the queue" + item);
        que.display();

    }

}
