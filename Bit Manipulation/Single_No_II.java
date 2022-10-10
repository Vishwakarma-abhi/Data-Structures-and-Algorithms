import java.util.*;

public class Single_No_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array

        int arr[] = { 0, 1, 0, 1, 0, 1, 99 };
        // Output --> 99
        System.out.println("Given Array");
        display(arr);
        int res = naive(arr);
        System.out.println(" \nNon - repeating  element  --> " + res);

    }

    public static int naive(int[] arr) {
        int count = 0;
        int res = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                res = arr[i];
            }
        }
        return res;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
