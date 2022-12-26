import java.util.HashMap;
import java.util.Scanner;

public class find_duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.next();

        // approch_hashmap(str);
        approch_naive(str);

    }

    public static void approch_hashmap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (!map.containsKey(str.charAt(i))) {

                map.put(str.charAt(i), i);
            } else {
                System.out.println(str.charAt(i));
            }
        }
    }

    // naive solution
    public static void approch_naive(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && (i != j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i));
            }
        }
    }

}
