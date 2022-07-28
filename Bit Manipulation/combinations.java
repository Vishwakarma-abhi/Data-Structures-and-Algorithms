import java.util.*;

public class combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.println("Enter value of n and k");
        System.out.println("n --> " + (n = sc.nextInt()));
        System.out.println("k --> " + (k = sc.nextInt()));
        List<List<Integer>> list = new ArrayList<>();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        helper(0, arr, list, new ArrayList<>(), k);
        System.out.println("Result ");
        System.out.println(list);

    }

    // More to be optimized Time ---> 2^n*k Space - O(n) + k + n
    private static void helper(int idx, int[] arr, List<List<Integer>> list, List<Integer> ds, int k) {
        if (ds.size() == k) {
            list.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < arr.length; i++) {

            ds.add(arr[i]);
            helper(i + 1, arr, list, ds, k);
            ds.remove(ds.size() - 1);

        }
    }

}
