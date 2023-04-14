import java.util.*;

public class findMInimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 3, 4, 5, 1, 2 };
        // Binary Search appproach
        // Time - O(log n) Space - O(1)
        int minElement = findMin(arr);
        System.out.println("Minimum element in the Array " + minElement);

    }

    public static int findMin(int[] arr) {
        int n = arr.length;

        int start = 0, end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                // condition for minimum element it will be less than its less than its previous
                // in the rotated array
                return arr[mid];
            } else if (arr[mid] >= arr[start] && arr[mid] > arr[end]) {
                // left half is sorted
                // now we know the min element is in the other part
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // this case comes when the start and end point to one index that is at minimum
        // element
        return arr[start];
    }

}
