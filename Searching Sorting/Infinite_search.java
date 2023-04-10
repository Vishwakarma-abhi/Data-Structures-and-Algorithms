import java.util.*;

public class Infinite_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int low = 0, high = 1;
        int k = arr[0];

        // Since it is an infinite Sorted Array SO we can apply Binary Search
        // But Before that we need High value because the array is infinite
        System.out.println("Enter target value to be searched");
        int target = sc.nextInt();
        while (target > arr[high]) {
            low = high;
            if (high * 2 < arr.length - 1) {
                high = high * 2;
            } else {
                high = arr.length - 1;
            }
            k = arr[high];

        }

        // Now We can apply the binary search
        int res = binsearch(arr, low, high, target);
        if (res == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found");
        }

    }

    public static int binsearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

}
