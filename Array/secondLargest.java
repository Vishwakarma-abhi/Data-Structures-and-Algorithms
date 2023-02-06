import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = 6;

        // In this Question We need to find the second largest element in the array

        // Approach -> We can calculate the difference of maximum element with all the
        // elements in the array
        // The element with the minimum difference and not equal to zero will be the
        // second largest since
        // it will be nearest to maximum element of the array

        // here we get the maximum element of the array

        int max = get_max(arr, n);

        // now we will traverse and check for minDifference and also store that element
        int minDifference = Integer.MAX_VALUE, second_max = 0;
        for (int i = 0; i < 0; i++) {

            // first we calculate for min difference

        }
    }

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
