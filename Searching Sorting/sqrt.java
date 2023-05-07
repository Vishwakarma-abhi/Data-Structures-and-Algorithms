import java.util.*;

class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = sc.nextInt();

        int squareRoot = mySqrt(number);
        System.out.println("Square Root of " + " number   --> " + squareRoot);
    }

    public static int mySqrt(int x) {
        if (x == 0)
            return 0;
        int start = 1, end = x;

        while (start < end) {
            // calculate the mid
            int mid = (start) + (end - start) / 2;
            // int sqr = mid * mid;

            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }
}