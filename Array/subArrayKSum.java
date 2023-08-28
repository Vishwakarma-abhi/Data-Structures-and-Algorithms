import java.util.*;

public class subArrayKSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 15, -5, 15, -10, 5, 1, 1, 1, 1, 1 };

        int currSum = 0;
        int start = 0, end = -1;
        System.out.println("Enter Sum");
        int sum = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            currSum += arr[i];
            // for starting case
            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(currSum - sum)) {

                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        System.out.println(start + "  " + end);

    }

}
