import java.lang.Thread.State;
import java.util.*;

// time - O(logn)
public class Sorted_rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int n = arr.length;

        int start = 0, end = n - 1;
        int idx = 0;
        int size = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int post = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;

            if (arr[mid] <= arr[post] && arr[mid] <= arr[prev]) {
                idx = mid;
                break;

            }
            // For moving towards unsorted array side
            else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            } else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
        }

        System.out.println("Pivot Index -> " + idx);
        System.out.println("Pivot Element" + arr[idx]);

        int target;
        System.out.println("Enter target element ");
        target = sc.nextInt();

        int part1 = binsearch(arr, 0, idx - 1, target);
        int part2 = binsearch(arr, idx, end, target);

        int res = part1 != -1 ? part1 : part2;
        if (part1 != -1 || part2 != -1) {
            System.out.println(target + " found  at index -> " + res);
        }

        else {
            System.out.println("Not found");
        }

    }

    private static int binsearch(int[] arr, int i, int j, int target) {

        int start = i, end = j;
        int idx = 0;
        int size = arr.length;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }

}
