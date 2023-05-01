import java.util.*;

/**
 * search_bitonic
 */
public class search_bitonic extends ma_bitonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bitonic Array
        int arr[] = { 1, 4, 8, 3, 2 };

        System.out.println("Enter element to be searched ");
        int target = sc.nextInt();

        search(arr, target);

    }

    private static void search(int[] arr, int target) {

        // first function to find the index of max element
        int apex = peak(arr);
        boolean res = false;
        int idx;

        // for the ascending part
        if (target == arr[apex]) {
            System.out.println("Target Found in the Bitonic Array at the index -- " + apex);
        } else if (target < arr[apex]) {
            // then the element can be present in the ascending part
            // Ascending Binary Search
            idx = AscbinSearch(arr, 0, apex - 1, target);
            System.out.println(idx);

        } else if (target > arr[apex]) {
            // descending Binary Search
            idx = DescbinSearch(arr, apex, arr.length, target);
            System.out.println(idx);
            ;
        } else {
            System.out.println("Element not found");
        }

        // for descendoing part

    }

    private static int AscbinSearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }

    private static int DescbinSearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }

    static int peak(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

            if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }

        }

        // otherwise the array is sorted and the max element is present ar last
        return (arr.length - 1);

    }

}