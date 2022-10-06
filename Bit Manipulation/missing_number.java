import java.util.*;

public class missing_number {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5 };
        int range = 5, i = 0;
        int res = 0;
        for (i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        for (i = 1; i <= range; i++) {
            res = res ^ i;
        }
        System.out.println("Missing element in the array -> " + res);
    }

}
