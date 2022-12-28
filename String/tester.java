import java.util.ArrayList;

public class tester {
    public static int smallestValue(int n) {
        int temp = n, sum = n;
        ArrayList<Integer> values = new ArrayList<>();
        values.add(n);
        while (sum != 0) {
            sum = calculate_prime_factors_sum(sum);
            values.add(sum);
        }

        System.out.println(values);
        return values.get(values.size() - 2);

    }

    public static int calculate_prime_factors_sum(int n) {
        int sum = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int one_prime_factors_sum(int n) {
        int sum = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(smallestValue(4));

    }
}
