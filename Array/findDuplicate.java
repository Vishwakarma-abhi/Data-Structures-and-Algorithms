import java.util.HashMap;

class findDuplicate {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 7, 8 };

        int res = approach2(arr);
        System.out.println(res);
    }

    public static int approach2(int[] nums) {

        boolean table[] = new boolean[nums.length + 1];
        int foundYou = nums[0];
        for (int i = 0; i < nums.length; i++) {
            // if table nums[i] is true it means the element is already present and now it
            // is duplicate
            if (table[nums[i]]) {
                foundYou = nums[i];
                break;
            }
            // else we mark the element as found
            table[nums[i]] = true;
        }
        return foundYou;
    }

    public static int approach1(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                result = nums[i];
            }
        }

        return result;

    }
}