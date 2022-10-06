import java.util.*;

public class odd_occuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 8, 7, 7, 8, 8 };
        naive(arr);

        // using Xor of all numbers technique
        optimized(arr);

    }

    // using Xor operator Properties
    // O(n) solution
    public static void optimized(int[] arr) {
        int res = 0;
        // xor operation to remove all number of duplicates elements and left only
        // non repeating element
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        System.out.println("Odd occuring Element in the array -> " + res);
    }

    public static void naive(int[] arr) {
        int flag = 0;
        Arrays.sort(arr);

        // O(n^2) solution
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if ((count & 1) != 0 && flag != 1) {
                System.out.println("Odd occuring elements is : " + arr[i]);
                flag = 1;
            }

        }
    }
}
