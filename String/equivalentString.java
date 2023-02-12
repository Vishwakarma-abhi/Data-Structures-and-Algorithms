import java.util.*;

public class equivalentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr1[] = { "a", "cb" };
        String arr2[] = { "ab", "c" };

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < arr1.length; i++) {
            str1 += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            str2 += arr2[i];
        }

        if (str1.equals(str2)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }

}
