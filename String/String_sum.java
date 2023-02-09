import java.util.*;
import java.io.*;

public class String_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.println("Enter a string");
        str = sc.next();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> alphaSet = new HashMap<>();
        System.out.println("Enter the value of K");
        int k = sc.nextInt();
        for (int i = 0; i < 26; i++) {

            alphaSet.put(alphabets.charAt(i), i + 1);

        }
        // System.out.println(alphaSet);

        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if (alphaSet.containsKey(str.charAt(i))) {
                num += alphaSet.get(str.charAt(i));
            }
        }

        System.out.println(num);

        //Error for some cases
        int number = Integer.valueOf(num);

        while (k != 0) {
            number = repeatSum(number);
            k--;
        }
        System.out.println("Result -> " + number);

    }

    private static int repeatSum(int num) {
        if (num < 10)
            return num;

        return num = num % 10 + repeatSum(num / 10);
    }

}
