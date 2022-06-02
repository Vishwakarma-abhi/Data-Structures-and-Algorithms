import java.sql.ResultSet;

public class Transpose {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("Original Matrix");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        int row = mat.length, col = mat[0].length;
        int[][] res = new int[col][row];
        // transpose
        System.out.println("Transpose of the Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                res[j][i] = mat[i][j];

            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {

                System.out.print(res[i][j] + " ");

            }
            System.out.println();
        }

    }

}
