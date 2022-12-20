public class pattern7 {
    public static void main(String[] args) {

        System.out.println("Pattern 7");

        // pascal triangle
        /*
         * ->_ _ _ _ * _ _ _ _
         * -> _ _ _* * * _ _ _
         * -> _ _ * * * * * _ _
         * -> _ * * * * * * *
         * -> * * * * * * * * *
         * 
         */
        int n = 5;
        String pattern_matrix[][] = new String[n][n * n];
        int mid = n - 1;
        int k = mid;
        for (int i = 0; i < pattern_matrix.length; i++) {
            for (int j = 0; j < pattern_matrix[i].length; j++) {

                if ((i + j) >= mid && ((i + j) <= k)) {
                    pattern_matrix[i][j] = "*";
                } else {
                    pattern_matrix[i][j] = " ";
                }

            }
            k = k + 2;
        }

        for (int i = 0; i < pattern_matrix.length; i++) {
            for (int j = 0; j < pattern_matrix[i].length; j++) {
                System.out.print(pattern_matrix[i][j] + "");
            }
            System.out.println();
        }
    }

}
