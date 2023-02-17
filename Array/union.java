import java.util.*;

public class union {
    // Union or Merging Two sorted Array Using Two Pointers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Time -> O(n+m) Space -> O(n);
        System.out.println("program for Union two arrays");
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 7 };
        // findUnion(arr1, arr2, 5, 3);
        Union(arr1, arr2, 5, 3);

    }

    public static void Union(int arr1[], int arr2[], int n, int m) {

        // two pointer appraoch
        int ptr1 = 0, ptr2 = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (ptr1 < n && ptr2 < m) {

            // case1
            if (arr1[ptr1] == arr2[ptr2]) {
                // then add any one
                list.add(arr1[ptr1]);
                ptr1++;

            } else if (arr1[ptr1] > arr2[ptr2]) {
                // then add arr2[ptr2]
                list.add(arr2[ptr2]);
                ptr2++;
            } else {
                // then add arr1[ptr1]
                list.add(arr1[ptr1]);
                ptr1++;

            }

        }
        while (ptr1 != n) {
            list.add(arr1[ptr1]);
            ptr1++;
        }
        while (ptr2 != m) {
            list.add(arr2[ptr2]);
            ptr2++;

        }
        System.out.println(list);
    }

    // Function to return a list containing the union of the two arrays.
    public static void findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here

        // Algo add all the elements to set and then set to arraylist and then return
        Set<Integer> elements = new HashSet<Integer>();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            elements.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            elements.add(arr2[i]);
        }
        for (Integer i : elements) {
            list.add(i);
        }
        Collections.sort(list);
        System.out.println("Union of Two arrays -->\n  " + list);
    }

}
