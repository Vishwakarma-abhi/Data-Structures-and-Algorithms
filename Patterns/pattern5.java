public class pattern5 {
    public static void main(String[] args) {

        System.out.println("Pattern 5");

        /*
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         * 
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i + 1; j--) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

}
