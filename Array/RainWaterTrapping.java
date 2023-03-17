import java.util.*;

public class RainWaterTrapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        // Brute force
        // Time - O(n^2) Space - O(n)
        BruteForce(arr);

        // Optimized Approach
        approach2(arr);

    }

    private static void approach2(int[] arr) {

        // In this approach we precalculate the left max and right max for each array
        // element
        int size = arr.length;
        // we will create a left array and right array
        int left[] = new int[size];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        // similarly calculate the right max array
        int right[] = new int[size];
        right[size - 1] = arr[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        int water = 0;
        // now we will find the amount of water for every building
        for (int i = 0; i < size; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.println("Total Rainwater Trapped " + water);
    }

    public static void BruteForce(int[] arr) {
        int water = 0;
        for (int i = 1; i < arr.length - 1; i++) {

            // find left max for arr[i]
            int left = arr[i];
            // loop from start to arr[i]
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            int right = arr[i];
            // loop from i+1 to last index
            for (int j = i + 1; j < arr.length; j++) {
                right = Math.max(right, arr[j]);
            }

            // main Trick formula to be observed and calculated
            water += Math.min(left, right) - arr[i];

        }
        System.out.println("Total trapped water => " + water);

    }

}
