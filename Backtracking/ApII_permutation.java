
import java.util.*;

public class ApII_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        make_permutation(0, arr, ls);

        System.out.println(ls);
        sc.close();

    }

    // TC -> O(n * n!) SC -> O(n)+O(n!)
    public static void make_permutation(int idx, int[] nums, List<List<Integer>> ls) {

        // idx is pointing to every index who needs to be swapped with other elements

        // base case
        // when idx reaches the last index it means no swapping can be done
        if (idx == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            // add the permutation array to the answer data structure
            ls.add(ds);
        }

        for (int i = idx; i < nums.length; i++) {

            swap(idx, i, nums);
            make_permutation(idx + 1, nums, ls);

        }

    }

    public static void swap(int idx, int i, int[] arr) {
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }

}
