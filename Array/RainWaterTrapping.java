import java.util.*;

public class RainWaterTrapping {

    // Brute force
    // Time - O(n^2) Space - O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

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

            water += Math.min(left, right) - arr[i];

        }
        System.out.println("Total trapped water => " + water);
    }

}
