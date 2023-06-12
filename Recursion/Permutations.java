import java.util.*;

public class Permutations {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 2 };

        // Generate all possible permutations by rearranging the elements
        permute(arr);

    }

    public static void permute(int[] nums) {

        List<List<Integer>> ls = new ArrayList<>();

        // here we will give each element n choices to be picked for generating all
        // possible permutation
        // as one element will be used for rearrangement

        // so track it using a boolean array
        boolean visit[] = new boolean[nums.length];

        make_permutation(nums, ls, new ArrayList<>(), visit);

        System.out.println("The Generated Permutations ");
        System.out.println(ls);

    }

    public static void make_permutation(int[] nums, List<List<Integer>> ls, List<Integer> ds,
            boolean[] visit) {

        // BASE CASE IF THE BUCKET IS FILLED WITH ALL THE ALL ELEMENTS THEN WE STORE IT
        // AND RETURN
        if (ds.size() == nums.length) {
            ls.add(new ArrayList<>(ds));
            return;

        }

        // GIVING EVERY INDEX MULTIPLE CHOICES
        // So position of one element will be at different places due to rearrangements

        for (int i = 0; i < nums.length; i++) {

            // now we check if the current ith element is choosen or not
            // if choosen we will choose other elements
            if (!visit[i]) {
                visit[i] = true;

                ds.add(nums[i]);
                // we call the function again to choose other elements by marking the current
                // element as visited
                make_permutation(nums, ls, ds, visit);
                // do not pick condition
                ds.remove(ds.size() - 1);
                // mark it not visited
                visit[i] = false;

            }

        }

    }
}
