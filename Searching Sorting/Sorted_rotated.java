import java.lang.Thread.State;
import java.util.*;

// time - O(logn)
public class Sorted_rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int start = 0, end = arr.length - 1;
        int idx = 0;
        int size = arr.length;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            // for preventing Inddex out of bond error
            int post = (mid + 1) % size;
            int prev = (mid + size - 1) % size;

            // the min element is less than both of its neighbour
            if (arr[mid] <= arr[post] && arr[mid] <= arr[prev]) {
                idx = mid;
            }
            // left side is unsorted
            if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
            // right side is unsorted
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
        }
        System.out.println("Index -> " + idx);

        int target = 0;

        int part1 = binsearch(arr, 0, idx - 1, target);
        int part2 = binsearch(arr, idx, end, target);

        if (part1 == 1) {
            System.out.println(target + "  found");
        } else if (part2 == 1) {
            System.out.println(target + "  Found");
        }

        else {
            System.out.println("Not found");
        }

    }

    private static int binsearch(int[] arr, int i, int j, int target) {

        int start = 0, end = arr.length - 1;
        int idx = 0;
        int size = arr.length;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return 1;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }

        return 0;
    }

}
