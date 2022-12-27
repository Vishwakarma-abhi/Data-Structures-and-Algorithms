import java.util.Scanner;

public class two_rotating_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "abcde";
        String str2 = "cdeab";

        boolean result = false;
        System.out.println(str1);
        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.charAt(str1.length() - 1) + str1.substring(0, str1.length() - 1);
            System.out.println(str1);
            if (str1.equals(str2)) {
                result = true;
                break;
            }
        }
        System.out.println(result);

    }

}
