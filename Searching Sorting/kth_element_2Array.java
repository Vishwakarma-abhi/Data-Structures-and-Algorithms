import java.util.*;

public class kth_element_2Array {

    private static int find_kthElement(int[] arr1, int[] arr2, int n, int m, int k) {

        // we have to apply the approach buy taking first cut from small size array

        if (m > n) {
            return find_kthElement(arr2, arr1, n, m, k);
        }

        // now take low and high
        int low = Math.max(0, k - m), high = Math.min(k, n);

        // now we will apply binary search approach
        while (low <= high) {

            // calculate the cut1 -> from arr1 and cut2 -> arr2
            int cut1 = (low + high) / 2;
            int cut2 = k - cut1;

            // now we will calculate l1, l2 , r1,r2
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr1[cut2 - 1];

            int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == m ? Integer.MAX_VALUE : arr1[cut2];

            // now we will check the valid condition for the cut1 and cut2 from both the
            // arrays
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
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

        int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };

        int target = 5;

        // Effecient Approach using -> Binary Search

        int res = find_kthElement(arr1, arr2, arr1.length, arr2.length, target);
        System.out.println("The kth element of the Two Sorted array => " + res);

        // i for arr1 j for arr2 k for merge
        // int i = 0, j = 0;
        // List<Integer> list = new ArrayList<>();

        // // merging concept
        // while (i <= arr1.length - 1 && j <= arr2.length - 1) {
        // // if array 1 has larger element
        // if (arr1[i] > arr2[j]) {
        // list.add(arr2[j]);
        // System.out.println(j);
        // // k++;
        // j++;
        // } else {
        // list.add(arr1[i]);
        // // k++;
        // i++;
        // }
        // }
        // while (i < arr1.length) {
        // list.add(arr1[i]);
        // i++;
        // }
        // while (j < arr2.length) {
        // list.add(arr2[j]);
        // j++;
        // }
        // System.out.println(list);
        // System.out.println(list.get(target - 1));

    }

}
