import java.util.HashSet;

public class isomorphic {
    public static void main(String[] args) {

        String s = "egg", t = "add";

        if (isIsomorphic(s, t)) {
            System.out.println("Yes they are isomorphic");
        } else {
            System.out.println("No they arenot isomorphic");
        }

    }

    public static boolean isIsomorphic(String s, String t) {

        // base case for different Length
        if (s.length() != t.length()) {
            return false;
        }

        int map1[] = new int[250];
        int map2[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            // Concept of degree sequence
            if (map1[s.charAt(i)] != map2[t.charAt(i)])
                return false;

            // Insert each character if string s and t into separate map

            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        return true;

    }

}
