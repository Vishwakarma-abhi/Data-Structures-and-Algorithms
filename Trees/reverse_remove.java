import java.util.*;

public class reverse_remove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = "acab";

        replaceOriginal(S, S.length());
    }

    static void replaceOriginal(String s, int n) {
        // initialize a string of length n
        char r[] = new char[n];

        // Traverse through all characters of string
        for (int i = 0; i < n; i++) {

            // assign the value to string r
            // from last index of string s
            r[i] = s.charAt(n - 1 - i);

            // if s[i] is a consonant then
            // print r[i]
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i'
                    && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                System.out.print(r[i]);
            }
        }
        System.out.println("");
    }
}
