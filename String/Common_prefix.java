import java.util.*;

class Common_prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String words[] = { "flower", "flow", "flight" };
        ArrayList<String> prefix_ArrayList = new ArrayList<>();

        String common_prefix = "";

        // System.out.println(calculate_prefix(words[0], words[1]));

        // for (int i = 0; i < words.length - 1; i++) {
        // prefix_ArrayList.add(calculate_prefix(words[i], words[i + 1]));

        // }
        // System.out.println(prefix_ArrayList);

        System.out.println(LCP(words));
    }

    public static String LCP(String str[]) {
        String lcp = "";

        return lcp;

    }

    public static String calculate_prefix(String str1, String str2) {

        String prefix = "";

        int l = Math.min(str1.length(), str2.length());
        int i = 0, j = 0;
        while (l != 0) {
            if (str1.charAt(i) == str2.charAt(j)) {
                prefix += str1.charAt(i);

            }
            i++;
            j++;
            l--;

        }

        return prefix;

    }
}