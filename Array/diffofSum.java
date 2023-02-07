import java.util.*;

public class diffofSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        int arr[] = { 1, 15, 6, 3 };
        int eSum = 0, dSum = 0;
        for (int i = 0; i < arr.length; i++) {
            eSum += arr[i];

            dSum += cal_dSum(arr[i]);
        }
        System.out.println("Absolute Differnece between eSum and dSum => " + Math.abs(eSum - dSum));

    }

    public static int cal_dSum(int i) {

        if (i < 10)
            return i;
        int dSum = 0;
        while (i != 0) {
            dSum += i % 10;
            i = i / 10;
        }
        return dSum;
    }

}
