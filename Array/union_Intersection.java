import java.util.HashSet;
import java.util.Scanner;

public class union_Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3 };

        HashSet<Integer> set = new HashSet<>();
        // n - size of array 1 and m - size of array 2
        // O(n+m)
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set.size());
    }
}
