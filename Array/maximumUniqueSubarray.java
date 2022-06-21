import java.util.Scanner;

public class maximumUniqueSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int nums[] = new int[size];

        System.out.println(subarray_sum(arr));

    }

    static int subarray_sum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.contains(nums[i])) {
                map.put(i, nums[i]);

            }
        }

        for (float f : map.values()) {
            sum += f;
        }

        return sum;
    }
}
