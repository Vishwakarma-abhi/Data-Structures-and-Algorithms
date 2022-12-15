import java.util.*;

//more to be optimized
class sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

        int arr[] = new int[n * n];
        int k = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                arr[k] = mat[i][j];
                k++;
            }

        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        int p = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = arr[p];
                p++;
            }

        }
        // System.out.println("\nSorted Matrix");
        // System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

    }
}