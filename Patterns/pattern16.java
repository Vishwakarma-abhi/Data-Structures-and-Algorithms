import java.util.*;
import java.util.zip.CRC32C;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows for the pattern ");
        int row = sc.nextInt();

        /*
         * A
         * BB
         * CCC
         * DDDD
         * EEEEE
         */

        int alpha = 65;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) alpha + "  ");
            }
            alpha++;
            System.out.println();
        }

    }

}
