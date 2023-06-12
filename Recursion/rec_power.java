import java.util.Scanner;

class rec_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = sc.nextInt();

        System.out.println("Enter the power ");
        int n = sc.nextInt();

        // Now Approac1 - using loop
        // But here we have to do using recurion

        int res = calculate(x, n);

        System.out.println(res);
    }

    private static int calculate(int x, int n) {

        // write base condition
        if (n == 0)
            return 1;
        // logic for calculation

        x = x * calculate(x, n - 1);
        return x;
    }
}