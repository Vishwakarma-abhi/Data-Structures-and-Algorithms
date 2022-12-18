import java.util.Scanner;

public class rotate_Arr_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;

        int k = 3;
        // for (int j = 0; j < k; j++) {
        // int temp = arr[n - 1];

        // for (int i = 0; i < arr.length - 1; i++) {
        // arr[n - i - 1] = arr[n - i - 2];
        // }
        // arr[0] = temp;

        // }

        int result[] = new int[arr.length];

        rotater(arr, k, result);

        System.out.println("K times rotated array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + "   ");
        }
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i + 1] + " ");
        // }
        System.out.println("\n" + result.length);
        sc.close();
    }

    public static void rotater(int arr[], int k, int result[]) {

        int mid = arr.length / 2;

        for (int i = 0; i < mid + 1; i++) {
            result[i + k] = arr[i];

        }
        for (int j = 0; j < result.length / 2; j++) {
            result[j] = arr[j + k + 1];
        }

    }

}
