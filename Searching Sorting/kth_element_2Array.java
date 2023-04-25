import java.util.*;

public class kth_element_2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = { 1, 1, 1, 1 };
        int arr2[] = { 0, 0, 0, 0, 0 };

        int target = 3;
        // i for arr1 j for arr2 k for merge
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        // merging concept
        while (i <= arr1.length - 1 && j <= arr2.length - 1) {
            // if array 1 has larger element
            if (arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                System.out.println(j);
                // k++;
                j++;
            } else {
                list.add(arr1[i]);
                // k++;
                i++;
            }
        }
        while (i < arr1.length) {
            list.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            list.add(arr2[j]);
            j++;
        }
        System.out.println(list);
        System.out.println(list.get(target - 1));

    }

}
