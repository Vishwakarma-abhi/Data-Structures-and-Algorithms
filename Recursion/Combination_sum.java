import java.util.*;

class Combination_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter required sum");
        int sum = sc.nextInt();
        int arr[] = { 2, 3, 6, 7 };

        // now we will call a function we generate all possible combinations
        List<List<Integer>> list = new ArrayList<>();

        combinations(arr, 0, list, new ArrayList<>(), sum);

        System.out.println("Generated Combinations are --> ");
        System.out.println(list);
    }

    private static void combinations(int[] arr, int idx, List<List<Integer>> list, ArrayList<Integer> ds, int sum) {

        // base condition
        if (idx == arr.length) {
            if (sum == 0) {
                list.add(new ArrayList<>(ds));

            }
            return;
        }

        // pick condition
        if (arr[idx] <= sum) {
            ds.add(arr[idx]);
            // same number can be choosen any number of times

            combinations(arr, idx, list, ds, sum - arr[idx]);
            ds.remove(ds.size() - 1);
        }

        combinations(arr, idx + 1, list, ds, sum);

    }
}