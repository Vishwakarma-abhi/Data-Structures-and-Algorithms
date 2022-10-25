import java.util.Scanner;

public class number_1_191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 00000000000000000000000000001011;
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(str.charAt(i));
        }
        System.out.println(arr[0]);
        // int result = setbits(num);
        // System.out.println("Number of 1 bits => " + result);

    }

    public static int setbits(int temp) {
        int i = 0, sum = 0;

        while (i != 31) {
            sum += temp % 10;
            temp /= 10;
            i++;
        }

        return sum;
    }
}
