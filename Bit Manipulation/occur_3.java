import java.util.Arrays;
import java.util.Scanner;

public class occur_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Given array
        int arr[] = { 12, 1, 12, 3, 12, 1, 1, 2, 3, 3 };
        // we have to find which element appears only one

        naive(arr);

    }

    public static void naive(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count != 3) {
                System.out.println("Once occurig element is -->  " + arr[i]);
                break;
            }
        }
    }

}
