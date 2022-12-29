import java.util.*;

class first_last_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // needed to be optimized
        // given data
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };

        int n = 9;
        int x = 5;

        int idx = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // naive approach
        // traverse the array here we can use two pointer approach
        // searching the element x from both the ends when found add them and
        int pointer1 = 0, pointer2 = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                pointer2 = i;

            }
            if (arr[n - i - 1] == x) {
                pointer1 = n - i - 1;

            }

        }
        // adding the pointed indexed
        result.add(pointer1);
        result.add(pointer2);

        System.out.println(result);

    }

}