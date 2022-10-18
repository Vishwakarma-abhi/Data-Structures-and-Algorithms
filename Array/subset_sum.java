import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subset_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 2;
        int arr[] = { 2, 3 };
        System.out.println("Subset sum ");
        ArrayList<Integer> sub_sum = new ArrayList<>();

        cal_subsum(0, arr, N, sub_sum, 0);

        System.out.print(sub_sum);

    }

    public static void cal_subsum(int i, int[] arr, int N, ArrayList<Integer> list, int sum) {

        // if the pointer reaches to the last index of the array
        if (i >= N) {
            list.add(sum);
            return;

        }

        sum += arr[i];
        // now we will pick the next index element
        cal_subsum(i + 1, arr, N, list, sum);
        sum -= arr[i];

        // Don't pick condition
        cal_subsum(i + 1, arr, N, list, sum);

    }

}
