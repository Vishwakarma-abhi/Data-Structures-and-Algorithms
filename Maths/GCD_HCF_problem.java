import java.util.Scanner;

public class GCD_HCF_problem {
    // HCF <--> GCD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // program for GCD --> Greatest Common Divisior
        // GCD meand the greatest number which is divisible by both the numbers
        System.out.println("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // function for calculating gcd
        gcd_approach1(num1, num2);

        // optimized code Time complexity -> O(log (min(a,b)) Space complexity -> O(1)
        int gcd = Euclid_algo(num1, num2);
        System.out.println("GCD of " + num1 + "  " + num2 + " -> " + gcd);

    }

    // Optmized approach Time complexity -> O(1) Space complexity -> O(1)
    public static int Euclid_algo(int num1, int num2) {
        // base case
        if (num1 == 0) {
            return num2;
        }

        // now the euclid concept for gcd
        return Euclid_algo(num2 % num1, num1);

    }

    // Brute Force Approach Time Complexity -> O(min(A,B)) Space complexity -> O(1)
    public static void gcd_approach1(int num1, int num2) {
        int gcd = 0;
        // loop we will be range till the highest value number entered
        for (int i = 1; i < (num1 > num2 ? num1 : num2); i++) {

            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;

            }

        }

        // GCD or HCF of the given two numbers
        System.out.println("Greatest Common Divisor --> " + gcd);

    }

}
