import java.util.*;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the val");
        int n = sc.nextInt();

        String pattern_matrix[][] = new String[n][n * 2];
        int mid = n - 1;
        int k = mid;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {

                if ((i + j) >= mid && ((i + j) <= k)) {
                    // System.out.print("*");
                    pattern_matrix[i][j] = "*";
                } else {
                    // System.out.print(" ");
                    pattern_matrix[i][j] = " ";
                }

            }

            k = k + 2;
        }
        original(pattern_matrix);
        reverse(pattern_matrix);

    }

    public static void original(String[][] pattern_matrix) {
        for (int i = 0; i < pattern_matrix.length; i++) {
            for (int j = 0; j < pattern_matrix[i].length; j++) {
                System.out.print(pattern_matrix[i][j] + "");
            }
            System.out.println();
        }

    }

    public static void reverse(String[][] pattern_matrix) {
        for (int i = pattern_matrix.length - 1; i >= 0; i--) {
            for (int j = pattern_matrix[i].length - 1; j >= 0; j--) {
                System.out.print(pattern_matrix[i][j] + "");
            }
            System.out.println();
        }

    }

}
