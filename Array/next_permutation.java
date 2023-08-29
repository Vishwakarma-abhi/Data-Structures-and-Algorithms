import java.util.*;

public class next_permutation {

    public static void solve(int[] arr) {
        // Step 1 first find the element from back side which is smaller than its front
        // element
        // Break point
        int breakPoint = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        // Step 2 now find the element which is greater than that index element or break
        // point element
        if (breakPoint != -1) {
            for (int i = n - 1; i > breakPoint; i--) {

                if (arr[i] > arr[breakPoint]) {
                    // swap the elements
                    int temp = arr[breakPoint];
                    arr[breakPoint] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }

        // Step 3 now reverse the suffix to get the next desired answer
        // nOw reverse the suffix
        int start = breakPoint + 1;
        int end = arr.length - 1;
        while (start < end) {
            // swap
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Next Permutation is ");
        solve(arr);
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
