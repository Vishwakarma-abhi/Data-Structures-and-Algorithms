import java.util.*;

// Time  -> O(row * col) Space -> O(col)
class BinaryMatrix_MaxArea extends Largest_Rectangle_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2 D given Binary Matrix
        int mat[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };

        // In this array we will store the 2 D matrix 1 D part wise ( row wise )
        int arr[] = new int[4];
        int row = 4, col = 4;

        // Now first store the first row of the 2D matrix into the 1 D array
        // converting 2D to 1D`1
        for (int j = 0; j < col; j++) {
            arr[j] = mat[0][j];
        }

        int maxArea = maxAreaHistogram(arr, arr.length);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    arr[j] = 0;
                } else {
                    arr[j] += mat[i][j];
                }
            }
            maxArea = Math.max(maxArea, maxAreaHistogram(arr, arr.length));
        }

        System.out.println("MaxArea of the Binary matrix-> " + maxArea);

    }
}