import java.util.*;

public class shuffle_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 1, 2, 2 };
        System.out.println("\n Original Array");
        display(arr);
        System.out.println("\n\nShuffled Array");
        int result[] = shuffle(arr, 2);
        display(result);

    }

    public static int[] shuffle(int[] nums, int n) {

        // Using Two pointer algo
        int shuffle[] = new int[nums.length];
        int l = 0, r = n;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                shuffle[i] = nums[l];
                l++;
            } else {
                shuffle[i] = nums[r];
                r++;
            }
        }
        return shuffle;

    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
