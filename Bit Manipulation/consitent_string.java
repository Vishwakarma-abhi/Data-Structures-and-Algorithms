import java.util.*;

public class consitent_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String allowed = "ab";
        String str[] = { "ad", "bd", "aaab", "baa", "badab" };

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < allowed.length(); i++) {
            if (!map.containsKey(allowed.charAt(i)))
                ;
            {
                map.put(allowed.charAt(i), i);
            }

        }
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (naive(map, str[i])) {
                count++;
            }
        }
        System.out.println("Total consistent String ==> " + count);

    }

    // TC -> O(n) SC -> O(n)
    public static boolean naive(HashMap<Character, Integer> map, String str) {
        boolean res = true;

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {

                res = false;
            }
        }

        return res;

    }

}
