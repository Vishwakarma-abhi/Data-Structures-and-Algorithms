import java.util.*;

class Max_SubArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter window size");
        int win_size = sc.nextInt();

        // brute Force
        bruteForce(arr, win_size);
        // Optimized approach -> Sliding Window
        
    }

    private static void bruteForce(int[] arr, int win_size) {
        // brute force -> O(n^2)
        int maxSubSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - win_size; i++) {
            int sum = 0;
            for (int j = i; j < i + win_size; j++) {
                sum += arr[j];
            }
            if (sum > maxSubSum) {
                maxSubSum = sum;
            }

        }
        System.out.println("Maximum Sub Array Sum -> " + maxSubSum);
    }
}