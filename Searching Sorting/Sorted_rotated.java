import java.util.*;

public class Sorted_rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 102, 110, 2, 3, 4, 6, 12, 45, 99 };

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
    }
}
