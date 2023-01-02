import java.util.HashMap;

public class find_missing {
    public static void main(String[] args) {

        int arr[] = { 2, 2 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        for (int i = 1; i <= 3; i++) {
            res = res ^ i;
        }

        int result[] = new int[2];
        int idx = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (!map.containsKey(i)) {
                result[idx] = i;
                idx++;
                break;
            }
        }
        result[1] = res ^ result[0];
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
