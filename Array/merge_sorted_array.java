import java.util.*;

class merge_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = { 20, 30, 40, 50, 60 };

        int arr2[] = { 15, 22, 31, 45, 56, 62, 78 };

        int result[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, idx = 0;

        while (i <= arr1.length - 1 && j <= arr2.length - 1) {

            if (arr1[i] > arr2[j]) {
                result[idx] = arr2[j];
                result[idx + 1] = arr1[i];
            } else {

                result[idx] = arr1[i];
                result[idx + 1] = arr2[j];
            }
            idx = idx + 2;
            i++;
            j++;
        }

        while (i != arr1.length) {
            result[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j != arr2.length) {
            result[idx] = arr2[j];
            j++;
            idx++;
        }

        System.out.println("Your Merged Array");
        for (int k = 0; k < result.length; k++) {
            System.out.print(result[i] + "  ");
        }

    }
}