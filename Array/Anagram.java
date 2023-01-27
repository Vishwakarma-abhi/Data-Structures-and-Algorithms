import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1, str2;

        System.out.println("Anagram Program");
        System.out.println("Enter two Strings for Checking ");
        str1 = sc.next();
        str2 = sc.next();

        // function for checking anagram
        if (isAnagram(str1, str2)) {
            System.out.println("Yes both string " + str1 + " and " + str2 + " are Anagrams");

        } else {
            System.out.println("No both string " + str1 + " and " + str2 + " are Anagrams");

        }
    }

    public static boolean isAnagram(String s, String t) {
        // Time Complexity -> O(nlogn)
        // Space complexity -> O(1)
        boolean res = true;

        // if the String 's length are not equal then simply return false'
        if (s.length() != t.length())
            return false;
        String str1 = sortString(s);
        String str2 = sortString(t);

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;

            }
        }
        return res;

    }

    // Sort the Strings function
    public static String sortString(String inputString) {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

}
