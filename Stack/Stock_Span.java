import java.util.*;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Stock Span Problem");
        // Price of Stocks Everyday
        int price[] = { 100, 80, 60, 70, 60, 75, 85 };
        int size = price.length;

        int out[] = new int[size];

        // Now we will implement usig Stack Data Structure
        // Stack of pair type
        Stack<Pair> stk = new Stack<>();

        for (int i = 0; i < price.length; i++) {

            // there will be two conditions

            // first -> If Stack is empty
            if (stk.isEmpty()) {
                // then we add -1 it means no day has greater price
                out[i] = -1;
            } else if (!stk.isEmpty() && stk.peek().val > price[i]) {

                // we store the index of the greatest element
                out[i] = stk.peek().pos;
            } else if (!stk.isEmpty() && stk.peek().val <= price[i]) {
                // then we need to pop the elments

                while (!stk.isEmpty() && stk.peek().val <= price[i]) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    // then we add 1 to the output priceay
                    out[i] = -1;
                } else {
                    // we store the index of the greatest element
                    out[i] = stk.peek().pos;
                }

            }
            stk.push(new Pair(price[i], i));

        }

        // including the == condition for each day
        for (int i = 0; i < out.length; i++) {
            out[i] = i - out[i];
        }

        System.out.println("OUTPUT");
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + "  ");
        }

        // bruteForce(price, size); // -> O(n^2)
    }

    public static class Pair {
        int val;
        int pos;

        public Pair(int val, int pos) {
            this.val = val;
            this.pos = pos;
        }

    }

    public static void bruteForce(int[] price, int size) {
        // Brute Force
        int out[] = new int[size];
        priceays.fill(out, 1);
        for (int i = size - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {

                if (price[j] > price[i])
                    break;
                else {
                    out[i] += 1;
                }
            }
        }
        System.out.println("Output priceay");
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + "  ");
        }

    }

}
