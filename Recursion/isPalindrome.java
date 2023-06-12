import java.util.Scanner;

public class isPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.next();

        System.out.println("Checking id Palindrome or not ......");

        if (checkPalindrome(str, 0)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static boolean checkPalindrome(String str, int l) {
        if (l >= str.length() / 2) {
            return true;
        }
        if (str.charAt(l) == str.charAt(str.length() - 1 - l)) {
            return checkPalindrome(str, l + 1);
        } else {
            return false;
        }
    }
}
