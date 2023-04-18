import java.util.*;

import javax.sound.midi.MidiDevice;

/**
 * search_bitonic
 */
public class search_bitonic extends ma_bitonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bitonic Array
        int arr[] = { 1, 4, 8, 3, 2 };

        System.out.println("Enter element to be searched ");
        int target = sc.nextInt();

        search(arr, target);

    }

    private static void search(int[] arr, int target) {

        // first function to find the index of max element
        int apex = peak(arr);

        // for the ascending part


        // for descendoing part

    }
    

    static int peak(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

            if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }

        }

        // otherwise the array is sorted and the max element is present ar last
        return (arr.length - 1);

    }

}