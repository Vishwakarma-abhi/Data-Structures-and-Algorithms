import java.util.Scanner;

public class pattern7 {

    // Time complexity -> O(n^2)
    public static void print_triangle(int n) {
        int row = n;
        int odd_star = 1;

        // this is outer loop for no. of lines

        for (int i = 1; i <= n; i++) {

            // now have a loop for no. of spaces
            // number of spaces for the given pattern for each row --> (n-i);
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // now we will have a loop will prints odd number of * for each row
            for (int j = 1; j <= odd_star; j++) {
                System.out.print("*");
            }
            odd_star = odd_star + 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern 7");

        // pyramid triangle
        /*
         * ->_ _ _ _ * _ _ _ _
         * -> _ _ _* * * _ _ _
         * -> _ _ * * * * * _ _
         * -> _ * * * * * * *
         * -> * * * * * * * * *
         * 
         */
        // int n = 5;

        System.out.println("Enter value of n");
        int n = sc.nextInt();

        print_triangle(n);

        // String pattern_matrix[][] = new String[n][n * 2];
        // int mid = n - 1;
        // int k = mid;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n * 2; j++) {

        // if ((i + j) >= mid && ((i + j) <= k)) {
        // System.out.print("*");
        // // pattern_matrix[i][j] = "*";
        // } else {
        // System.out.print(" ");
        // // pattern_matrix[i][j] = " ";
        // }

        // }
        // System.out.println();
        // k = k + 2;
        // }

        // for (int i = 0; i < pattern_matrix.length; i++) {
        // for (int j = 0; j < pattern_matrix[i].length; j++) {
        // System.out.print(pattern_matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

    }

}
