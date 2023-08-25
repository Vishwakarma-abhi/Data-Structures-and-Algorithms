import java.util.*;

public class twoSum {

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        // approach 1 -> Using two loops Brute force
        brute(arr, target);

        // optimized approach -> O(n)
        optimized(arr, target);
    }

    private static void optimized(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Optimized approach ");
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem)) {
                System.out.println(map.get(rem) + "  " + i);
                break;
            }
            map.put(arr[i], i);
        }
    }

    // Brute Force -> O(n^2)
    private static void brute(int[] arr, int target) {
        System.out.println("Brute Force ");
        int len = arr.length;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + "  " + j);
                    break;
                }
            }
        }
    }

}
