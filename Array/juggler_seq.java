import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class juggler_seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the Range for the pattern ");
        int N = sc.nextInt();

        System.out.println(pattern(N));
    }

    // Time complexity - O(n)
    public static List<Integer> pattern(int N) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(N);
        helper(N, list);
        return list;

    }

    // Hypothesis -> sequence(9) --> 9 27 140 11 36 6 2 1
    public static void helper(int N, ArrayList<Integer> list) {
        // base case
        if (N == 1) {
            return;
        }
        int temp;
        if ((N % 2) == 0) {
            temp = (int) Math.floor(Math.sqrt(N));
            list.add(temp);
        } else {
            temp = (int) Math.floor(Math.pow(N, 1.5));
            list.add(temp);

        }

        helper(temp, list);

    }

}
