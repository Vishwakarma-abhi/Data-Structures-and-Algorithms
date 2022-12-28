import java.util.HashMap;
import java.util.Scanner;

public class similar_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input words array
        String words[] = { "aba", "aabb", "abcd", "bac", "aabc" };

        // counter varibale
        int count = 0;

        for (int i = 0; i < words.length - 2; i++) {

            for (int j = i + 1; j < words.length - 1; j++) {

                if (checker(words[i], words[i + 1])) {
                    count++;
                }
            }
        }
        System.out.println("Total Similar Strings --> " + count);

    }

    // checker method for comparing the strings in the array
    public static boolean checker(String word1, String word2) {
        boolean result = true;

        HashMap<Character, Integer> w1 = new HashMap<>();
        HashMap<Character, Integer> w2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            w1.put(word1.charAt(i), i);
        }
        for (int i = 0; i < word2.length(); i++) {
            w1.put(word2.charAt(i), i);
        }

        if (w1.size() > w2.size()) {
            for (int i = 0; i < word1.length(); i++) {
                if (!w2.containsKey(word1.charAt(i))) {
                    result = false;
                }
            }
        } else if (w1.size() == w2.size()) {
            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.charAt(i) != word2.charAt(j)) {
                        result = false;
                    }
                }
            }

        } else {
            for (int i = 0; i < word1.length(); i++) {
                if (!w1.containsKey(word2.charAt(i))) {
                    result = false;
                }
            }
        }

        System.out.println(result);
        return result;

    }

}
