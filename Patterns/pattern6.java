public class pattern6 {
    public static void main(String[] args) {

        System.out.println("Pattern 6");

        /*
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print((j + 1) + "  ");
            }
            System.out.println();
        }
    }

}
