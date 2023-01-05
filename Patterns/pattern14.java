import java.util.*;

public class pattern14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int alpha;

        for (int i = 1; i <= n; i++) {
            alpha = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) alpha);
                alpha++;
            }
            System.out.println();
        }
    }

}
