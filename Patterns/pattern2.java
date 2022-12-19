import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pattern 2");

        /*
         * 
         * 
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

}
