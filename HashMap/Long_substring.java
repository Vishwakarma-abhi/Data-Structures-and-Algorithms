import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Math.max;

import java.math.*;

public class Long_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String string = sc.next();

        int length = length_longest_substring(string);
        System.out.println("Length of the longest substring  = " + length);
    }

    public static int length_longest_substring(String string) {
        if (string.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < string.length(); ++i) {
            if (map.containsKey(string.charAt(i))) {
                // Updating the positions of the pointer j
                j = max(j, map.get(string.charAt(i)) + 1);
            }
            // Add to the hashmap if absent
            map.put(string.charAt(i), i);
            // Calculating the maximum length of the substring .
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

}
