import java.util.*;

public class LCM extends GCD_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Brute Force apprach
        calculate_LCM(num1, num2);

        // Optimized approach using GCD
        int lcm = (num1 * num2) / (Euclid_algo(num1, num2));
        System.out.println("LCM of ->" + num1 + "  " + num2 + "  ->" + lcm);

    }

    // we can derive LCM from GCD which is optimize way Takes O(log(min(A,B)))

    // Brute force Time complexity -> O(min(A,B)) Space complexity -> O(1)
    public static void calculate_LCM(int num1, int num2) {
        int lcm = 1;
        for (int i = 1; i < Math.min(num1, num2); i++) {
            if ((num1 % i == 0) || (num2 % i == 0)) {
                lcm *= i;
            }
        }
        System.out.println("LCM of " + num1 + "  " + num2 + "  -> " + lcm);

    }

}
