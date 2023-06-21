import java.util.*;

class merge_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long arr1[] = { 1, 4, 9, 10, 26 };

        long arr2[] = { 2, 5, 6 };

        // int m = 3, n = 3;
        // // int result[] = new int[arr1.length + arr2.length];
        // int i = m + n - 1;
        // int pointer1 = m - 1, pointer2 = n - 1;

        // // we will have a loop which will be traversing according to the adding of
        // // elements
        // // when the pointer 2 which is for array 2 finishes its traversing and adding
        // of
        // // elments
        // // the loop terminates
        // while (pointer2 >= 0) {

        // // if the elements of array 1 is greater than array 2 then the elements of
        // the
        // // array 1 pointed by p1
        // // is shifted forward according to its position
        // if (pointer1 >= 0 && arr1[pointer1] > arr2[pointer2]) {
        // arr1[i] = arr1[pointer1];

        // }
        // // else the array 2 element is greater and it is added in the
        // else {

        // arr1[i--] = arr2[pointer2--];
        // }

        // }

        // using two pointers
        merge(arr1, arr2, arr1.length, arr2.length);
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[i] + " ");
        }
    }
    // Time Complexity: O(min(n, m)) + O(n*logn) + O(m*logm), where n and m are the
    // // sizes of the given arrays.
    // Reason:

    // O(min(n, m)) is for swapping the array

    // elements. And O(n*logn)

    // and O(m*logm) are for sorting the two arrays.

    public static void merge(long arr1[], long arr2[], int n, int m) {
        // code here

        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m) {

            if (arr1[left] > arr2[right]) {
                // swap them
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }

        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
}