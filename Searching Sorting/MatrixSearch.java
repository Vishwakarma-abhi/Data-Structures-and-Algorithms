import java.util.*;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // the given array is sortd both row wise and Columnn wise
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        System.out.println("Enter the key to be seached");
        int key = sc.nextInt();

        int[] res = new int[2];
        // Naive Approach to seach the key using O(n^2) solution

        // optimized solution using the concept of Binary Search
        searchElement(arr, key, res);
        System.err.println(res[0] + " " + res[1]);

    }

    public static int[] searchElement(int[][] arr, int key, int[] res) {

        // here elemination of rows and columns on the basis of comparision with the key
        // is done
        int i = 0, j = 3;
        // condition for array bound error and if the element is not found
        while (i >= 0 && i <= arr.length && j >= 0 && j <= arr[i].length) {
            if (arr[i][j] == key) {
                res[0] = i;
                res[1] = j;
                return res;
            } else if (arr[i][j] > key)
                // column is eliminated
                j--;
            else
                // row is eleminated
                i++;
        }
        res[0] = res[1] = -1;
        return res;

    }

}
