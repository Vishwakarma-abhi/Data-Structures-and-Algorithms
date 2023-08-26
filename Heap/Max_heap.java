import java.util.*;

class Max_heap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 30, 50, 20, 35, 15 };
        build_maxheap(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void build_maxheap(int Arr[]) {
        int N = Arr.length - 1;
        for (int i = N / 2; i >= 0; i--)
            maxHeap(Arr, N, i);
    }

    protected static void maxHeap(int[] arr, int N, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left <= N && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right <= N && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp; // Corrected the swap here
            maxHeap(arr, N, largest);
        }
    }
}
