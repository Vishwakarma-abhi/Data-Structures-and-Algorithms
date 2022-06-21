import java.util.Scanner;

class wave_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        // Original Array
        System.out.println("Original Array ");
        display(arr);
        // Output - arr[1] >= arr[2] <= arr[3] <= arr[4] <= arr[5] ;

        convertToWave(arr.length, arr);

        System.out.println("Wave Array ");
        // Displaying wave array
        display(arr);
    }

    // Wave array converter function
    public static void convertToWave(int len, int[] arr) {
        for (int i = 0; i < len - 1; i++) {

            // Swapping
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
    }

    // Array display function
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}