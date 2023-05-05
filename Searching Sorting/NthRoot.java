import java.util.*;;

// to do 
public class NthRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = sc.nextInt();

        System.out.println("Nth Root Value ");
        int n = sc.nextInt();
        int squareRoot = NRoot(number, n);
        System.out.println("Nth Root of " + " number   --> " + squareRoot);
        sc.close();
    }

    public static int NRoot(int x, int n) {
        if (x == 0)
            return 0;
        double start = 1, end = x;
        double eps = 1e-6;

        while ((start - end) > eps) {
            // calculate the mid
            double mid = (start + end) / 2.0;
            // int sqr = mid * mid;

            if (multiply(mid, n) < x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return (int) start;

    }

    private static double multiply(double mid, int n) {

        double ans = 1.0;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
        }
        return ans;
    }
}
