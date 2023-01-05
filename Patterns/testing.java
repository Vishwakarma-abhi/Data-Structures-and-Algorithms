public class testing {
    public static void main(String[] args) {

        int n = 5;
        int c = 0;

        // step 1 number of lines of the pattern i.e till 1 to n
        for (int row = 1; row <= 2 * n - 1; row++) {
            // step 2 identify the number of colums assigned to each row

            // step 3 build the formula / relation between the rows and columns
            if (row <= n) {
                // regular print the pattern
                // till row <= n increase the number of assigned columns of each row
                c = c + 1;
            } else {
                // when the row reaches n + 1 we start decreasing the number of assigned columns
                c = c - 1;
            }

            // print the pattern according to the assigned columns to each row
            for (int col = 1; col <= c; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
         * 1*
         * 2* *
         * 3* * *
         * 4* * * *
         * 5* * * * *
         * 6* * * *
         * 7* * *
         * 8* *
         * 9*
         */
    }

}
