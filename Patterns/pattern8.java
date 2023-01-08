import java.util.Scanner;

public class pattern8 {

    // Time complexity -> O(n^2)
    // Space complexity -> O(n)
    public static void print_reverseTriangle(int n) {
        int row = n;

        int odd_star = 2 * n - 1;

        for (int i = 1; i <= row; i++) {

            // loop for printing spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // now we will have loop for printing star odd times
            for (int j = 1; j <= odd_star; j++) {
                System.out.print("*");
            }
            odd_star = odd_star - 2;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pattern 7");

        /*
         *********
          *******
           *****
            ***   
             * 
         */

        // int n = 5;
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        // String pattern_matrix[][] = new String[n][n * 2];
        // int mid = n - 1;
        // int k = mid;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n * 2; j++) {

        // if ((i + j) >= mid && ((i + j) <= k)) {

        // pattern_matrix[i][j] = "*";
        // } else {
        // pattern_matrix[i][j] = " ";
        // }

        // }
        // k = k + 2;
        // }

        // for (int i = pattern_matrix.length - 1; i >= 0; i--) {
        // for (int j = pattern_matrix[i].length - 1; j >= 0; j--) {
        // System.out.print(pattern_matrix[i][j] + "");
        // }
        // System.out.println();
        // }
        print_reverseTriangle(n);
    }

}
