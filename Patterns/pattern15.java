import java.util.*;

public class pattern15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int alpha;
        //number of columns assigned to each row
        int c = n;
        for (int i = 1; i <= n; i++) {
            alpha = 65;
            for (int j = 1; j <= c; j++) {
                System.out.print((char) alpha);
                alpha++;
            }
            c--;
            System.out.println();
        }
    }

}
