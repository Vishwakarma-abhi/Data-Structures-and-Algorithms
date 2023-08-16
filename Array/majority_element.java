import java.util.*;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we need to optimize the code compulsory

        // Input Array
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        // int len = arr.length;

        // // naive approach
        // // Time complexity -> O(size of the map) -> O(nlon)
        // // Space complexity -> O(n)
        // System.out.println("Majority Element --> " + majorityElement(arr, len));

        // better approach
        // using hashmap
        int maj = better(arr);
        System.out.println(maj);

        optimized(arr);

    }

    // Moore Voting Algorithm
    private static void optimized(int[] arr) {

        int cnt = 0, el = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            }

            else if (arr[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                count++;
            }
        }
        if (count > (arr.length / 2)) {
            System.out.println(el);
        } else {
            System.out.println("NO Majority element");
        }
    }

    private static int better(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (arr.length / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }

    static int majorityElement(int a[], int size) {
        // your code here

        if (size == 1)
            return a[0];

        // sort the elements so that all the duplicates are aligned in adjacent manner
        Arrays.sort(a);

        // counter == 1 because all the elements will be atleast once in the array
        int count = 1;
        // (size-1) so that a[i+1] adjacent elements are compared
        for (int i = 0; i < size - 1; i++) {
            // since array is sorted so we are comparing the adjacent elements
            // if the adjacent elements are equal it means it is occuring more than once and
            // counter is increamented
            if (a[i] == a[i + 1]) {
                count++;
            }
            // else the adjacent element is not equal and counter for a[i] will be one
            else {
                count = 1;
            }
            // so if the count element is greater than size / 2
            // we found the majority element
            if (count > size / 2) {
                return a[i];

            }
        }

        // if no majority element is present we return -1
        return -1;
    }

}
