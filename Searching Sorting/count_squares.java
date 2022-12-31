import java.util.*;

public class count_squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 9;

        ArrayList<Integer> res = new ArrayList<>();
        int i = 1;
        int count = 0;
        // here we are checking the condition that (perfect) square of any number is
        // less than N or not
        // since we are taking sqaure of itself it will be a perfect sqare automatically

        /*
         * Time complexity
         * --> i = sqrt(N)
         * --> O(sqrt(N))
         * 
         * Space complexity
         * --> O(1)
         * 
         * 
         */
        while (i < Math.sqrt(n)) {
            res.add(i * i);
            count++;
            i++;

        }
        System.out.println("Perfect Squares Less than " + n + " --> " + res);
        System.out.println(count);

    }

}
