import java.util.*;

public class string_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.next();

        System.out.println("Input String --> " + str);

        System.out.println("All Subsequences are");

        // first we will out all the characters in a String array
        String arr[] = null;
        arr = str.split("");

        // this can optimized and has more solution
        // method - 1 using array
        // Time complexity --> O(2^n)
        // Space compleity --> arrayspace -> O(n) + O(n) + stack space O(n) --> O(n)

        // this array list will store all the subsequences of the string --> "str"
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> ds = new ArrayList<>();
        // now we will create a function which generates and stores the subsequence
        subsquence_generator(0, arr, list, ds);

        System.out.println(list);
    }

    public static void subsquence_generator(int idx, String[] arr, ArrayList<ArrayList<String>> list,
            ArrayList<String> ds) {
        // here we will have two choice either pick the element or don't pick the
        // element
        // if index reaches the last index then there will be no choices so the
        // subsequence will be added to the list as a member
        if (idx >= arr.length) {
            if (!ds.isEmpty()) {
                list.add(new ArrayList<>(ds));

            }
            return;

        }

        // condition to pick the element
        // here we choose the character at index --> idx
        ds.add("" + arr[idx]);

        // now we move forward to next index
        subsquence_generator(idx + 1, arr, list, ds);

        // conditon to do not pick the element
        // removing the added element
        ds.remove(ds.size() - 1);

        subsquence_generator(idx + 1, arr, list, ds);

    }

}
