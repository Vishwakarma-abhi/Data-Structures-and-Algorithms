import java.util.Arrays;
import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of rows and columns for the pattern ");
        int n = sc.nextInt();

        System.out.println("Holo Rectangle Pattern");
        print_holo_rectangle(n);
        // approach_two(n);
    }

    public static void print_holo_rectangle(int n) {
        int p1 = 0, p2 = n - 1;

        String pattern[][] = new String[n][n];
        for (int i = 0; i < n; i++) {

            if ((i == p1) || (i == p2)) {
                for (int j = 0; j < n; j++) {
                    pattern[i][j] = "*";
                }

            } else {
                pattern[i][p1] = pattern[i][p2] = "*";
            }
        }

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                if (pattern[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(pattern[i][j]);
                }
            }
            System.out.println();
        }
    }

    // public static void approach_two(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // if (i == n - 1 || j == n - 1) {
    // System.out.print("* ");
    // }

    // // if (i == n - 1 || j == 0) {
    // // System.out.print("* ");
    // // }
    // }
    // System.out.println();
    // }
    // }

}
