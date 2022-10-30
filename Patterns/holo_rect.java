import java.util.*;

class holo_rect {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows ");
        int rows = sc.nextInt();
        System.out.println("Enter Colums ");
        int cols = sc.nextInt();
        // * * * */
        /*      */
        /* * * */
        pattern(rows, cols);

    }

    public static void pattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i == 1 || i == rows) && (j == 1 || j == cols)) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}