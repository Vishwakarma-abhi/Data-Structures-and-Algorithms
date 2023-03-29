
import java.util.*;

public class Ceil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 8, 10, 10, 12 };

        int start = 0, end = arr.length - 1;

        int target = 5;
        int res = findCeil(arr, start, end, target);
        System.out.println("Ceil Value of  " + target + "  " + res);
    }

    public static int findCeil(int arr[], int start, int end, int target) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return res;
            }
            if (arr[mid] > target) {
                res = arr[mid];
                end = mid - 1;
            }
            if (arr[mid] < target) {

                start = mid + 1;
            }

        }
        return res;
    }

}
