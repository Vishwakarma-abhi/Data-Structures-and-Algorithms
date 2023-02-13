import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = 6;

        // In this Question We need to find the second largest element in the array

        int max = get_max(arr, n);

        // now we will traverse and check for minDifference and also store that element
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
       
        System.out.println("Second Max -> " + second_max);

    }

    private static int get_max(int[] arr, int n) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
