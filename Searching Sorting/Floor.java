
import java.util.*;

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 8, 10, 10, 12 };

        int start = 0, end = arr.length - 1;

        int target = 5;
        int res = findFloor(arr, start, end, target);
        System.out.println("Floor Value of  " + target + "  " + res);
    }

    public static int findFloor(int arr[], int start, int end, int target) {
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return res = mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                res = mid + 1;
                start = mid + 1;
            }

        }
        return res;
    }

}
