import java.util.*;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();
        // O(n) -> TC
        // Approach :-
        /*
         * Here we have to see two things the digit sum is calculated
         * and That sum is transforming into as the new number
         * And again same process is done untill it becomes 1 Digit
         */
        while (num >= 10) {
            num = repeatSum(num);
        }
        System.out.println("Repeated Sum of Digits -> " + num);

    }

    public static int repeatSum(int num) {

        if (num < 10)
            return num;

        return num = num % 10 + repeatSum(num / 10);
    }

}
