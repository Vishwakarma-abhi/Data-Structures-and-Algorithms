import java.util.ArrayList;
import java.util.List;

public class Subset_II {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5 };

        System.out.println("Required Subsets");
        System.out.println(subsets_II(nums));

    }

    public static List<List<Integer>> subsets_II(int[] nums) {

        List<List<Integer>> ans = new ArrayList();

        // here we will use the concept of pick and don't pick elements'

        // a new Data Structure will be used to store corresponding subsets that are
        // obtained
        BuildSubsets(nums, 0, ans, new ArrayList<Integer>());

        return ans;

    }

    // Generating unique subsets if it has duplicate elements
    public static void BuildSubsets(int[] nums, int idx, List<List<Integer>> list, List<Integer> ds) {

        list.add(new ArrayList<>(ds));

        // here we check for duplicate elements
        for (int i = idx; i < nums.length; i++) {

            // so this condition
            // - keeps track of adjacent elements
            // and when i is ahead of idx then we check wheather current element i.e. ith
            // element is previously choosen or not
            // if it is choosen (equal) then we continue and avoid adding it in the ds for
            // preventing duplication
            if (i > idx && nums[i] == nums[i - 1])
                continue;

            // now pick the element
            ds.add(nums[i]);

            // move forward to pick other element
            BuildSubsets(nums, i + 1, list, ds);

            // now if you do not want to pick the element
            ds.remove(ds.size() - 1);
            // and then continue to pick other elements

        }

    }
}
