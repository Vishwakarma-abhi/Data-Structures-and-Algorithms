import java.util.Scanner;

public class pattern7 {
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

        String pattern_matrix[][] = new String[n][n * 2];
        int mid = n - 1;
        int k = mid;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {

                if ((i + j) >= mid && ((i + j) <= k)) {
                    System.out.print("*");
                    // pattern_matrix[i][j] = "*";
                } else {
                    System.out.print(" ");
                    // pattern_matrix[i][j] = " ";
                }

            }
            System.out.println();
            k = k + 2;
        }

        // for (int i = 0; i < pattern_matrix.length; i++) {
        // for (int j = 0; j < pattern_matrix[i].length; j++) {
        // System.out.print(pattern_matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
    }

}
