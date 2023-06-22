
import java.util.*;

public class circular_QUEUE {

    private int size, front, rear;

    private ArrayList<Integer> queue = new ArrayList<>();

    circular_QUEUE(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    // Let's write function to insert element

    public void enQueue(int data) {

        // condition to check queue is full
        if ((rear + 1) % size == front)
            System.out.println("Full");

        if (front == -1)
            front = 0;
        rear = (rear + 1) % size;
        queue.add(rear, data);

    }

    public int deQueue() {
        if (front == -1) {
            System.out.println("No element");
        }

        int res = queue.get(front);
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        circular_QUEUE q = new circular_QUEUE(5);

    }

}
