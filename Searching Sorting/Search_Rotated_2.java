import java.util.*;

public class Search_Rotated_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // given array
        // It is rotated at some pivot
        int arr[] = {};

        // Element to be searched
        System.out.println("Enter the search element");
        int target = sc.nextInt();

        // now calling a function to implement search operation --> Binary Search

        modBinSearch(arr, target);

    }

    private static boolean modBinSearch(int[] arr, int target) {

        int start = 0, end = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if the middle element is target or not
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] > arr[start]) {
                if (target < arr[mid] && target >= arr[start]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }

            } else if (arr[mid] < arr[start]) {
                if (target > arr[mid] && target < arr[start]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }

            } else {
                start++;
            }

        }

        return false;
    }

}
