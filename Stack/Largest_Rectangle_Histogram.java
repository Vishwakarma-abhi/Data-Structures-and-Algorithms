import java.util.*;

public class Largest_Rectangle_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rect_length[] = { 3, 5, 1, 7, 5, 9 };
        int size = rect_length.length;
        // Here we will calculate : longo two different array
        // -> Nearest Smallest to lEFT
        // -> Nearest Smallest to RIGHT

        // maxAreaHistogram Calculator --> MAH
        int maxArea = maxAreaHistogram(rect_length, size);
        System.out.println(maxArea);

    }

    public static int maxAreaHistogram(int rect_length[], int size) {

        int NSL[] = new int[size];

        int NSR[] = new int[size];

        // System.out.println("Nearest Smallest to Left");
        // nearest smallest to left
        calculate_NSL(rect_length, NSL);
        // for (int i = 0; i < NSR.length; i++) {
        // System.out.print(NSL[i] + " ");
        // }
        // System.out.println("\nNearest Smallest to Right");
        // nearest smallest to right
        calculate_NSR(rect_length, NSR);
        // for (int i = 0; i < NSR.length; i++) {
        // System.out.print(NSR[i] + " ");
        // }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            // corrected *
            // go with the concept developed formula
            // { right_small - left_small}
            int area = rect_length[i] * (NSR[i] - NSL[i] + 1);
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println("\nMaximum Area of historgram => " + maxArea);
        return maxArea;

    }

    // left small element array calculation
    public static void calculate_NSL(int[] rect_length, int[] nSL) {

        // here we will calcualate the nearest Smallest element for each index values
        Stack<Pair> stk = new Stack<>();
        int sudoIndex = 0;
        for (int i = 0; i < nSL.length; i++) {
            if (stk.isEmpty()) {
                nSL[i] = (int) sudoIndex;

            } else if (!stk.isEmpty() && stk.peek().val >= rect_length[i]) {

                // we will pop we the stack contains greater element because we want nearest
                // smallest 's index'
                while (!stk.isEmpty() && stk.peek().val >= rect_length[i]) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    nSL[i] = (int) sudoIndex;
                } else {
                    nSL[i] = (int) stk.peek().pos + 1;
                }
            } else if (!stk.isEmpty() && stk.peek().val < rect_length[i]) {
                // we set the boundary for the particular bar
                nSL[i] = (int) stk.peek().pos + 1;
            }
            stk.push(new Pair(rect_length[i], i));
        }
    }

    public static void calculate_NSR(int[] rect_length, int[] nSR) {
        // here we will calcualate the nearest Smallest element for each index values
        Stack<Pair> stk = new Stack<>();
        int sudoIndex = rect_length.length - 1;
        for (int i = nSR.length - 1; i >= 0; i--) {
            if (stk.isEmpty()) {
                nSR[i] = (int) sudoIndex;

            } else if (!stk.isEmpty() && stk.peek().val >= rect_length[i]) {

                // we will pop we the stack contains greater element because we want nearest
                // smallest 's index'
                while (!stk.isEmpty() && stk.peek().val >= rect_length[i]) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    nSR[i] = (int) sudoIndex;
                } else {
                    nSR[i] = (int) stk.peek().pos - 1;
                }
            } else if (!stk.isEmpty() && stk.peek().val < rect_length[i]) {
                nSR[i] = (int) stk.peek().pos - 1;
            }
            stk.push(new Pair(rect_length[i], i));
        }
    }

    public static class Pair {
        int val;
        int pos;

        Pair(int val, int pos) {
            this.val = val;
            this.pos = pos;
        }
    }

}
