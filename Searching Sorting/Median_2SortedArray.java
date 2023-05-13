import java.util.*;

public class Median_2SortedArray {

    private static int find_Median(int[] arr1, int[] arr2, int m, int n) {

        // we have to apply the approach buy taking first cut from small size array

        if (m > n) {
            return find_Median(arr2, arr1, n, m);
        }

        // now take low and high
        int low = 0, high = m, medianPos = ((m + n) + 1) / 2;

        // now we will apply binary search approach
        while (low <= high) {

            // calculate the cut1 -> from arr1 and cut2 -> arr2
            int cut1 = (low + high) / 2;
            int cut2 = medianPos - cut1;

            // now we will calculate l1, l2 , r1,r2
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];

            int r1 = cut1 == m ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == n ? Integer.MAX_VALUE : arr2[cut2];

            // now we will check the valid condition for the cut1 and cut2 from both the
            // arrays
            if (l1 <= r2 && l2 <= r1) {
                if (((m + n) % 2 == 0)) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                // we have to take less item from arr1 and move it to right side
                // and vice versa for arr2
                high = cut1 - 1;
            } else {
                // we have to take less item from arr2 and move it to left side
                // and vice versa for arr1
                low = cut1 + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = { 2 };
        int arr2[] = { 1, 3 };

        // Effecient Approach using -> Binary Search

        double res = find_Median(arr1, arr2, arr1.length, arr2.length);
        System.out.println("The Median of the Two Sorted array => " + res);

    }

}
