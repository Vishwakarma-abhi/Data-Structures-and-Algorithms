import java.util.*;

/**
 * kthPos
 */
public class kthPos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 2, 3, 4, 7, 11 };

        // Naive Approach -> O(n)
        int pos = 1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = 5;

        // when we reach the kth missing number
        while (k > 0) {

            if (!set.contains(pos)) {
                // pos is missing
                k--;

            }

            pos++;
        }

        System.out.println(" kth Positive Integer =>  " + (pos - 1));

    }
}