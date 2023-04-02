import java.util.Scanner;

public class nearly_sorted {

    // this is bascially the variation of Binar Search
    // Here we search the elements for i , i-1, i+1 position
    // Time -> O(log2n) Space -> O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 5, 10, 30, 20, 40 };

        int n = arr.length;
        System.out.println("Enter the element to be seached \n");
        int target = sc.nextInt();

        int start = 0, end = n - 1;
        int res = Modify_BS(start, end, arr, target);

        if (res == -1) {
            System.out.println("Element Not found");
        } else {
            System.out.println("Element Found at index " + res);
        }

    }

    public static int Modify_BS(int start, int end, int arr[], int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if the arr[mid] is target
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid - 1] == target && (mid) > start) {
                return mid - 1;
            }

            if (arr[mid + 1] == target && (mid) < end) {
                return mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 2;
            }
            start = mid + 2;

        }
        return -1;

    }
}
