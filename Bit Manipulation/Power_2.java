import java.util.*;

public class Power_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean res = check_power(n);
        if (res) {
            System.out.println("Power of Two");
        } else {
            System.out.println("Not a Power of Two");
        }

    }

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

}
