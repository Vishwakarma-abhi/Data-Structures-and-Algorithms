
//More to be optimized 
//O(n/2)--> O(n)

import java.util.*;

public class Strings_alike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String str = "biok";

        // System.out.println(str.substring(0, str.length() / 2));
        // System.out.println(str.substring(str.length() / 2));

        System.out.println(halvesAreAlike("textbook"));

    }

    public static boolean halvesAreAlike(String s) {
        // book len = 4 part => bo part2 =>ok

        int len = s.length();

        String part1 = s.substring(0, len / 2);
        String part2 = s.substring(len / 2);
        System.out.println(count_vowel(part1));
        System.out.println(count_vowel(part2));
        if (count_vowel(part1) == count_vowel(part2)) {
            return true;
        }
        return false;

    }

    public static int count_vowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
