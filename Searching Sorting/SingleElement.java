import java.util.*;

public class SingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };

        int ans = singleNonDuplicate(arr);
        System.out.println(" Non Repeating element is -> " + ans);
    }

    // Binary Search Solution -> O(log n) 
    public static int singleNonDuplicate(int[] arr) {

        // brute force calculate the frequency

        // Optimized -> sorted -> Binary Search

        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }
        return arr[low];
    }

}
