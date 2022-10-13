
import java.util.*;

//Single Number III --> Leetcode
public class Two_oddoccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Two Odd Occuring ");
        int arr[] = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };

        // Naive Approach --> O(n^2)
        naive(arr);

        // Optimized Approach
        optimize(arr);

    }

    // optimized solution --> O(n) O(1)
    public static void optimize(int[] arr) {
        int res1 = 0, res2 = 0;
        int k = 0;
        Arrays.sort(arr);
        // Sorted array -> 15 16 20 20
        int xor = 0;

        // Calculating the XOR of all the elements of the array
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

        // Now we can observe that there is a set bit in the result of xor
        // whose one of the bit is 1 when both the numbers have on of their bits are
        // different at a certain position

        // Now we will get the set bit with exact position

        int sn = xor & (~(xor - 1));

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] & sn) != 0) {
                res1 ^= arr[i];
            } else {
                res2 ^= arr[i];
            }
        }

        System.out.println("Two odd occuring elements are --> " + (res1) + "  " + (res2));

    }

    public static void naive(int[] arr) {
        int odd[] = new int[2];
        int k = 0;
        Arrays.sort(arr);
        // Sorted array -> 15 16 20 20

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                odd[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.print(odd[i] + "  ");
        }
    }
}