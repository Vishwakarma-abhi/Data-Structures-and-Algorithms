import java.util.Scanner;

public class set_matrix2zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // naive solution
        int mat[][] = { { 0, 1, 0 }, { 1, 1, 1 }, { 0, 1, 0 } };
        // int copy[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        System.out.println("Original Matrix");
        display(mat);
        int row = mat.length, col = mat[0].length;

        int copy[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                copy[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] == 0) {
                    set_row(i, col, copy);
                    set_col(row, j, copy);
                }
            }
        }

        System.out.println("Transformed Matrix");
        display(copy);
    }

    public static void set_row(int row, int col, int[][] mat) {

        for (int i = 0; i < col; i++) {
            mat[row][i] = 0;
        }

    }

    public static void set_col(int row, int col, int[][] mat) {

        for (int i = 0; i < row; i++) {
            mat[i][col] = 0;
        }

    }

    public static void display(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

}
