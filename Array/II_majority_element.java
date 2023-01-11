import java.util.*;

public class II_majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we need to optimize the code compulsory

        // Input Array
        int arr[] = { 8, 8, 7, 7, 7 };
        List<Integer> list = new ArrayList<>();
        int len = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        naive_Approach(arr, map, len, list);
        System.out.println("Majority elements --> " + map);

    }

    public static void naive_Approach(int[] arr, HashMap<Integer, Integer> map, int len, List<Integer> list) {
        int maj = 0;
        int count = 0;
        for (Integer i : map.keySet()) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j])
                    count++;
            }
            System.out.println(i + " -> " + count);
            if (count > (len / 3)) {
                list.add(i);
            }
        }

    }

}
