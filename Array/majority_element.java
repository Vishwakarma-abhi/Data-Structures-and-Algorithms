import java.util.*;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we need to optimize the code compulsory

        // Input Array
        int arr[] = { 8, 8, 7, 7, 7 };
        int len = arr.length;

        // naive approach
        // Time complexity -> O(size of the map) -> O(n)
        // Space complexity -> O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        naive_Approach(arr, map, len);

    }

    public static void naive_Approach(int[] arr, HashMap<Integer, Integer> map, int len) {
        int maj = 0;
        int count = 0;
        for (Integer i : map.keySet()) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j])
                    count++;
            }
            System.out.println(i + " -> " + count);
            if (count > (len / 2)) {
                maj = i;
                break;
            }
        }
        System.out.println("Majority Element --> " + maj);
    }

}
