import java.util.*;

// Time -> O(log n)
public class Peak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 5, 4, 9, 5, 8 };
        findPeak(arr, arr.length);

    }
    // Binary Search Solution
    public static int findPeak(int[] arr, int n) {
        int start = 1, end = n - 2;
        int idx = 0;

        if (n == 1)
            return 0;
        if (arr[0] > arr[1])
            return 0;
        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1]) {
                idx = mid;
                break;

            }
            // For moving towards unsorted array side
            else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return idx;

    }

}
