import java.util.Scanner;

public class Insert_position extends Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 6 };
        System.out.println("Given Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nEnter target element");
        int target = sc.nextInt();

        // we have to find the insert position for the target number
        // Array is sorted so we can use Binary search
        // Approach -> We we find the floor value of target then we can return i+1 index

        int pos = searchInsertPos(arr, target);
        System.out.println("Inserting postion for " + target + "  -> " + pos);
    }

    // Time - O(log n)
    // space - O(1)
    public static int searchInsertPos(int arr[], int target) {

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

}
