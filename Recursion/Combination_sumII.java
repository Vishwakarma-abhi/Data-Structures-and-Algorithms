import java.util.*;

class Combination_sumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter required sum");
        int sum = sc.nextInt();
        // contain duplicates
        int arr[] = { 10, 1, 2, 7, 6, 1, 5 };

        // now we will call a function we generate all possible combinations
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        combinations(arr, 0, list, new ArrayList<>(), sum);

        System.out.println("Generated Combinations are --> ");
        System.out.println(list);
    }

    private static void combinations(int[] arr, int idx, List<List<Integer>> list, ArrayList<Integer> ds, int sum) {

        // base condition
        if (sum == 0) {
            list.add(new ArrayList<>(ds));
            return;
        }

        // so for avoiding duplicates we can use a loop
        for (int i = idx; i < arr.length; i++) {

            // here also we use the same logic for checking and avoiding duplicates
            // But here some more conditons are included

            // check if the consequetive elements are same or not
            // So for this logic array should be sorted

            if (i > idx && arr[i] == arr[i - 1])
                continue;

            // we cannot pick as exceed sum value
            if (arr[i] > sum)
                break;
            // now pick condition statements
            // one elements are choosen only once so we move forward for choosing other
            ds.add(arr[i]);

            combinations(arr, i + 1, list, ds, sum - arr[i]);

            // donot pick condition
            ds.remove(ds.size() - 1);

        }

    }
}