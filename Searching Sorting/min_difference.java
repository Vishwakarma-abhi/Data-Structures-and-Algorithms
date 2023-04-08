import java.util.*;

class min_difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 3, 8, 10, 12, 15 };

        int low = 0, high = arr.length - 1;
        int key = 13;
        int res = 0;
        // Time -> O(log n ) Space - O(1)
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                res = arr[mid];
                break;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        int mindiff = Math.min(Math.abs(arr[low] - key), Math.abs(arr[high] - key));

        System.out.println(mindiff);

    }
}