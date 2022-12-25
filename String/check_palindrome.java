import java.util.*;

class check_palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;

        System.out.println("Enter a String");
        str = sc.next();

        System.out.println("Checking for palindormic......");
        int result = check_palindrome(str, 0, str.length() - 1);

        if (result == 1) {
            System.out.println("Yes your given string is palindromic");
        } else {
            System.out.println("No it is not palindromic");
        }
    }

    // this function will traverse the string and check wheather the given
    // given string is palindrome or not
    public static int check_palindrome(String str, int start, int end) {

        int result = 1;
        // here we have used two pointer one from front index and another from end index

        // condition at which both the pointers start and end meet at the same point
        // then we end the meeting
        while (start <= end) {

            // comparing wheather the front char is equal to end chararcter
            // if not then it is not palindrome and we make the result = 0
            if (str.charAt(start) != str.charAt(end)) {
                result = 0;
            }
            // moving forward to next index
            start++;
            // moving backward to next index
            end--;
        }
        return result;

    }

}