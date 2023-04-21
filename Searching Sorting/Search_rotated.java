import java.util.Scanner;

public class Search_rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int n = arr.length;

        int start = 0, end = n - 1;
        int idx = -1;
        int size = arr.length;
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if target == arr[mid]
            if (arr[mid] == target) {
                idx = mid;
                break;
            }
            // now check the left half is sorted or not with respect to target
            // arr[start] <= target <=arr[mid]
            if (arr[start] <= arr[mid]) {
                if (arr[mid] >= target && arr[start] <= target) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && arr[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        System.out.println(idx);

    }

}
