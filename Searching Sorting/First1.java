import java.util.Scanner;

// This problem is the variation and combination of two problems using Binary Search -> First Occurence of any element and Infinite Sorted array

import javax.xml.namespace.QName;

public class First1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1 };
        display(arr);
        System.out.println("\nEnter the target number");
        int target = sc.nextInt();

        // Trick of calculationg the upper bound
        int low = 0, high = 1;
        while (arr[high] == 0) {
            low = high;
            high = high * 2;
            if (high * 2 < arr.length - 1) {
                high = high * 2;
            } else {
                high = arr.length - 1;
            }
        }
        int res = binsearch(arr, low, high, target);
        if (res == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("1 occurs first at  " + res + " position ");
        }

    }

    // Here We use Binary Search -> First Occurence + Infinite sorted array
    public static int binsearch(int[] arr, int low, int high, int target) {

        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                res = mid;
                high = mid - 1;

            }

            if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        return res;
    }

    public static void display(int[] arr) {
        System.out.println("Given array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
