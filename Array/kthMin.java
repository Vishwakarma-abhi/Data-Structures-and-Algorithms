import java.util.*;

public class kthMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 5, 3, 2, 4, 5, 6 };
        System.out.println("Enter Value of k");
        int k = sc.nextInt();

        // // Approach -1
        // Arrays.sort(arr);
        // System.out.println(arr[k - 1]);

        // // Approach -2 O(logn)

        // max Heap

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        System.out.println("kth smallest element  " + maxHeap.peek());

    }

}
