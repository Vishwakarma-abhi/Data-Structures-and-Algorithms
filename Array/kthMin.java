import java.util.*;

public class kthMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 5, 3, 2, 4, 5, 6 };
        System.out.println("Enter Value of k");
        int k = sc.nextInt();

        // Approach - 1 using Sorting
        // uSing Bubble sort
        // approach1(arr, k);

        // // Approach -2
        // Arrays.sort(arr);
        // System.out.println(arr[k - 1]);

        // // Approach -3 O(logn)

        // PriorityQueue<Integer> pq = new
        // PriorityQueue<Integer>(Collections.reverseOrder());
        // // step 1
        // for (int i = 0; i < k; i++) {
        // pq.offer(arr[i]);
        // }
        // // step 2
        // for (int i = k; i < arr.length; i++) {
        // if (arr[i] < pq.peek()) {
        // // first pop
        // pq.poll();
        // // now push
        // pq.offer(arr[i]);
        // }
        // }

        // // step 3
        // int ans = pq.peek();
        // System.out.println(ans);

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

    // apply bubble sort -> O(n^2)
    // Space -> O(1)
    private static void approach1(int[] arr, int k) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // check adjacent condition
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Kth smallest element -> " + arr[k - 1]);
    }

}
