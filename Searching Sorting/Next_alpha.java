
import java.util.*;

public class Next_alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char arr[] = { 'a', 'c', 'd', 'f' };

        int start = 0, end = arr.length - 1;

        char target;
        System.out.println("Enter the targert character to search");
        target = sc.next().charAt(0);
        char res = findNextalpha(arr, start, end, target);
        System.out.println("Next Element of  " + target + "  " + (res == '#' ? "\nno next element found" : res));
    }

    public static char findNextalpha(char[] arr, int start, int end, char target) {
        char res = '#';
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                if (mid == arr.length - 1) {
                    return res;
                } else {
                    return arr[mid + 1];
                }
            }
            if (arr[mid] > target) {
                res = arr[mid];
                end = mid - 1;
            }
            if (arr[mid] < target) {

                start = mid + 1;
            }

        }
        return res;
    }

}
