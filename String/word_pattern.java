import java.util.*;

public class word_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str2 = "dog cat cat dog";
        String sentence[] = str2.split(" ");
        String str1 = "aaba";

        boolean res = true;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < sentence.length; i++) {

            if (!(map.containsValue(sentence[i]))) {
                map.put(str1.charAt(i), sentence[i]);
            }

        }
        System.out.println(map);

        for (int i = 0; i < sentence.length; i++) {

            if (!(map.containsKey(str1.charAt(i)))) {
                if (map.get(str1.charAt(i)) == sentence[i]) {
                    System.out.println(str1.charAt(i) + "  True  " + sentence[i]);
                } else {
                    System.out.println(str1.charAt(i) + "  False  " + sentence[i]);
                }
            }
            // if (map.containsValue(sentence[i])) {

            // System.out.println("Found");

            // } else {
            // System.out.println("Not found");
            // }
        }

        // System.out.println(res);
    }

}
