import java.util.*;

public class reverse_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Original Queue");
        System.out.println(queue);

        System.out.println("Enter value of k");
        int k = sc.nextInt();

        Stack<Integer> stk = new Stack<>();

        Queue<Integer> q = new LinkedList<>();

        while (k != 0) {
            stk.add(queue.poll());
            k--;
        }

        while (!queue.isEmpty()) {
            q.add(queue.poll());
        }

        while (!stk.isEmpty()) {
            queue.add(stk.pop());
        }

        while (!q.isEmpty()) {
            queue.add(q.poll());
        }
        System.out.println("The reversed Queue");
        System.out.println(queue);

    }

}
