import java.util.*;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we need to optimize the code compulsory

        // Input Array
        int arr[] = { 8, 8, 7, 7, 7 };
        int len = arr.length;

        // naive approach
        // Time complexity -> O(n^2)
        // Space complexity -> O(1)
        naive_Approach(arr, len);

    }

    public static void naive_Approach(int[] arr, int len) {
        int maj = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            System.out.println(arr[i] + " -> " + count);
            if (count > (len / 2)) {
                maj = arr[i];
                break;
            }
        }
        System.out.println("Majority Element --> " + maj);
    }

}
