import java.util.*;

public class pref_2433 extends Single_No_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 5, 7, 2, 3, 2 };
        System.out.println("Original Array ");
        display(arr);
        int pref[] = new int[arr.length];
        findArray(arr, pref);
        System.out.println("\nModified Prefix Array");
        display(pref);
    }

    public static void findArray(int[] arr, int[] pref) {

        pref[0] = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                pref[i] ^= arr[j];
            }

        }

    }
}
