import java.util.*;

class generate_combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking user input for value of n
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int r = n - 1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            int combinations = (fact(n)) / (fact(i) * fact(n - i));
            list.add(combinations);
            // System.out.print(combinations + " ");
        }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(list.get(i) + " ");
        // }
        // System.out.println();
        // }

    }

    // factorial function
    public static int fact(int n) {
        if (n <= 1)
            return 1;

        return n * fact(n - 1);
    }
}