import java.util.*;

public class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Time -> O(n+m) Space -> O(n);
        System.out.println("program for Union two arrays");
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4 };
        findUnion(arr1, arr2, 5, 3);

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
