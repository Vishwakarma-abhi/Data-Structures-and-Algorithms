import java.util.*;

public class ma_bitonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bitonic Array ==> Monotomic increase - Max - Monotonic Decrease
        int arr[] = { 1, 4, 8, 3, 2 };

        System.out.println("Maximum in Bitonic Array  " + find_max(arr));
    }

    // O(log n approach ) = > SImilar to peak element - > O(log n)
    static int find_max(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

            if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }

        }

        // otherwise the array is sorted and the max element is present ar last
        return arr[arr.length - 1];

    }

}
