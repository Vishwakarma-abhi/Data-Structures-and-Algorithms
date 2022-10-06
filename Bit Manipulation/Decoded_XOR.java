import java.util.Scanner;

public class Decoded_XOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int encoded[] = { 1, 2, 3 };

        System.out.println("Encoded array");
        display(encoded);
        int first = 1;

        // Decoding to get the original array
        int org_arr[] = decode(encoded, first);

        System.out.println("\nDecoded Original Array ");
        display(org_arr);

        sc.close();
    }

    public static int[] decode(int[] encoded, int first) {

        int len = encoded.length;
        // creating the resutlant original array
        int arr[] = new int[len + 1];
        // we put first element in the original array
        arr[0] = first;

        // pointer to track the filling of elements in the original resultant array
        int j = 1;
        for (int i = 0; i < encoded.length; i++) {
            // addding decoded elements in the original array
            arr[j] = encoded[i] ^ first;
            // updating the values for generating the next element of org_arr
            first = arr[j];
            j++;
        }

        return arr;

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
