import java.util.*;

public class rotate_matrix_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = 3;
        int output[][] = new int[n][n];

        // transpose
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (i > j) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }

                // output[j][n - i - 1] = mat[i][j];
                // System.out.print(mat[n - j - 1][i] + " ");
            }
            System.out.println();
        }

        // After transpose we need to reverse the rows for the clockwise rotation

        for (int i = 0; i < mat.length; i++) {
            rotater(mat, i);
        }

        System.out.println("90 degree Rotated Matrix");
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotater(int[][] arr, int i) {

        for (int j = 0; j < arr.length / 2; j++) {
            int temp = 0;
            temp = arr[i][j];
            arr[i][j] = arr[i][arr.length - 1 - i];
            arr[i][arr.length - 1 - i] = temp;
        }
    }
}
