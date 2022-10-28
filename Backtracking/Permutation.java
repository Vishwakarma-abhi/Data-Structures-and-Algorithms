
import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        boolean visit[] = new boolean[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        // visit[i] = true;

        // visit[i] = false;
        // }
        make_permutation(arr, ls, ds, visit);

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

        for (int i = 0; i < nums.length; i++) {

            if (!visit[i]) {
                visit[i] = true;
                ds.add(nums[i]);

                make_permutation(nums, ls, ds, visit);
                ds.remove(ds.size() - 1);
                visit[i] = false;

            }

        }

    }

}
