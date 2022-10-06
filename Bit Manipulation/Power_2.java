import java.util.*;

public class Power_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean res = one_line(n);
        if (res) {
            System.out.println("Power of Two");
        } else {
            System.out.println("Not a Power of Two");
        }

    }

    // Effecient Solution
    static boolean check_power(int n) {
        // Base Case
        if (n <= 0) {
            return false;
        } else if ((n & (n - 1)) == 0) { // Brian algorithm concept
            return true;
        } else {
            return false;
        }
    }

    // Effecient Solution
    static boolean one_line(int n) {
        // Brian Algo
        // Unsetting the set bit if present
        // if it is the power of two then it will become zero
        return n != 0 && (n & (n - 1)) == 0;

    }

    static boolean naive(int n) {
        // Base Case
        if (n <= 0)
            return false;
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }

        if (count == 1)
            return true;
        return false;
    }

}
