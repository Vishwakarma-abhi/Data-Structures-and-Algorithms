import java.util.*;

class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3 };

        // using while loop and swapping
        approach1(arr); // -> Time - O(n) Space -O(1)
        // same thing we can achive using recursion
        System.out.println();
        approach2(arr, 0, arr.length - 1); // -> Time - O(n) Space -O(n)
        System.out.println();
        // approach -3 -> using Collection Framework Function
        approach3(arr);// -> Time - O(n) Space -O(N)
        System.out.println();
        display(arr);

    }

    private static void approach3(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.reverse(list);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

    }

    private static void approach2(int[] arr, int start, int last) {

        // we have to add base case here
        if (start >= last) {

            System.out.println("Approach - 2");
            display(arr);
            return;

        }
        // swap them

        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        // now recall
        approach2(arr, start + 1, last - 1);
    }

    private static void approach1(int[] arr) {

        // use the indices for reversing the elements
        int start = 0, last = arr.length - 1;
        // O(n/2)
        while (start <= last) {

            // swap first and last untill the last element is reached at the middle
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;

            start++;
            last--;

        }
        System.out.println("Approach - 1");
        display(arr);
    }

    private static void display(int[] arr) {
        System.out.println("New Reversed Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}