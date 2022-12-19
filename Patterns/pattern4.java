public class pattern4 {
    public static void main(String[] args) {

        System.out.println("Pattern 4");

        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((i + 1) + "  ");
            }
            System.out.println();
        }
    }

}
