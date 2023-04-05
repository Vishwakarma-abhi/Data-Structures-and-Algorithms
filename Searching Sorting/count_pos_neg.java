import java.util.*;

public class count_pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { -1, 5, 20, 66, 1314 };

        int start = 0, end = arr.length - 1;
        int res = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            // if the element is negative then remove left half
            if (arr[mid] < 0) {
                start = mid + 1;
            }
            // if the element is positive then remove right half
            if (arr[mid] >= 0) {
                end = mid - 1;
            }

        }
        System.out.println(Math.max(start, arr.length - start));
    }

}
