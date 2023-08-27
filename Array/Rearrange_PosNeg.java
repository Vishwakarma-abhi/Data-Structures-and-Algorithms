import java.util.Scanner;

public class Rearrange_PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // display(arr);

        int res[] = new int[size];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                res[pos] = arr[i];
                // now increament the pos to +2 position
                pos += 2;
            } else {
                res[neg] = arr[i];
                neg += 2;
            }
        }
        display(res);

    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
