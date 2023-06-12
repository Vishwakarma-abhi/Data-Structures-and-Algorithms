import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5 };

        System.out.println("Required Subsets");
        System.out.println(subsets(nums));

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList();

        // here we will use the concept of pick and don't pick elements'

        // a new Data Structure will be used to store corresponding subsets that are
        // obtained
        BuildSubsets(nums, 0, ans, new ArrayList<Integer>());

        return ans;

    }

    public static void BuildSubsets(int[] nums, int i, List<List<Integer>> list, List<Integer> ds) {

        // base condition
        if (i >= nums.length) {
            // add the subset to answer list
            list.add(new ArrayList<>(ds));
            return;

        }
        // now pick the element
        ds.add(nums[i]);
        // now move forward to pick another element
        BuildSubsets(nums, i + 1, list, ds);

        // now donot pick the element
        ds.remove(ds.size() - 1);
        BuildSubsets(nums, i + 1, list, ds);

    }
}
