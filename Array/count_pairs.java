
import java.io.*;
import java.util.*;

public class count_pairs {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 5, 7, 1 };
        int n = 4, k = 6;
        System.out.println(getPairsCount(arr, n, k));
    }

    static int getPairsCount(int[] arr, int n, int k) {
        // code here

        int result = 0;
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (hMap.containsKey(k - arr[i])) {
                result += hMap.get(k - arr[i]);
            }
            if (!hMap.containsKey(arr[i])) {
                hMap.put(arr[i], 1);
            } else {
                hMap.put(arr[i], hMap.get(arr[i]) + 1);
            }
        }

        return result;
    }
}
