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

        // Approach -2
        // Union
        Union(arr1, arr2);

        // Intersection
        // Intersection(arr1, arr2);
    }

    private static void Intersection(int[] arr1, int[] arr2) {

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {

                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

    }

    private static void Union(int[] arr1, int[] arr2) {

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[i] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
        }
        while (j < arr2.length) {
            System.out.print(arr2[i] + " ");
        }
    }
}
