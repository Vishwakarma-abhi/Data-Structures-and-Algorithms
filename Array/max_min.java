import java.util.*;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Time complexity -> O(n) Space-> O(1)
        // function to calculate the sum of max and min element in the array
        int Sum = Sum_max_min(arr, n);
        System.out.println("Sum of Max and Min element of the array -->  " + Sum);

        // Approach -2
        Arrays.sort(arr);
        int max = arr[0];
        int min = arr[arr.length - 1];
        System.out.println("max ->  " + max);
        System.out.println("min ->" + min);
    }

    // Approach - 1
    public static int Sum_max_min(int[] arr, int n) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max + min;

    }

}
