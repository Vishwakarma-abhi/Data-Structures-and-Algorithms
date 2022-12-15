import java.util.*;

public class rotate_matrix_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = 3;
        int output[][] = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                output[j][n - i - 1] = mat[i][j];
            }
        }

        System.out.println("90 degree Rotated Matrix");
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
