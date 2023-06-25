import java.util.*;

public class ma_freq {
    public static void main(String[] args) {

        String str = "10110";

        int freq[] = new int[2];

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '1') {
                freq[str.charAt(i) - '0']++;
            } else {
                freq[str.charAt(i) - '0']++;
            }

        }
        System.out.println(Math.max(freq[1],freq[0]));
    }

}
