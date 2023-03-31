import java.util.*;

public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Time - O(n) Space - O(1)
        if (checkSorting(arr, size)) {
            System.out.println("Array is sorted");
        } else {
            System.err.println("Not Sorted");
        }
    }

    // Sorting Concept of comparing the adjacent elements
    public static boolean checkSorting(int[] arr, int size)
    {
        for (int i = 0; i < size-1; i++) {
            if(arr[i] > arr[i+1])return false;
        }

        return true;
    }

}
