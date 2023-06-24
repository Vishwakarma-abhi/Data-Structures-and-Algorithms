import java.util.*;

public class findpairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = { "ff", "tx", "qr", "zw", "wr", "jr", "zt", "jk", "sq", "xx" };
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }
        int count = 0;
        for (int i = 0; i < str.length; i++) {

            StringBuffer rev = new StringBuffer(str[i]);
            rev = rev.reverse();

            if (set.contains(rev.toString())) {
                count++;

            }
        }
        System.out.println(count / 2);

    }

}
