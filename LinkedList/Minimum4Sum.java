import java.util.*;

public class Minimum4Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int result = minimumSum(num);
        System.out.println("Minimum Sum of Four Digit Number After Splitting Digits  = " + result);

    }

    public static int minimumSum(int num) {

        int new1 = 0, new2 = 0;
        int number[] = new int[4];

        for (int i = 0; i < 4; i++) {
            number[i] = num % 10;
            num = num / 10;
        }

        Arrays.sort(number);

        for (int i = 0; i < 4; i++) {
            if ((i % 2 == 0)) {
                new1 = new1 * 10 + number[i];
            } else {
                new2 = new2 * 10 + number[i];
            }
        }

        return (new1 + new2);

    }

}
