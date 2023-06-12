import java.util.*;

class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n s");
        int n = sc.nextInt();
        System.out.println("Enter size of each combination");
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // now we will call a function we generate all possible combinations
        List<List<Integer>> list = new ArrayList<>();

        combinations(arr, 0, list, new ArrayList<>(), k);

        System.out.println("Generated Combinations are --> ");
        System.out.println(list);
    }

    private static void combinations(int[] arr, int idx, List<List<Integer>> list, ArrayList<Integer> ds, int k) {

        // base condition
        if (ds.size() == k) {
            list.add(new ArrayList<>(ds));
            return;
        }

        // now generate other combinations
        for (int i = idx; i < arr.length; i++) {

            ds.add(arr[i]);
            combinations(arr, idx + 1, list, ds, k);
            // do not pick for combination
            ds.remove(ds.size() - 1);
        }
        // fp
        // .ssssssssssssss/sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
        // sssssssssssssssss

    }
}