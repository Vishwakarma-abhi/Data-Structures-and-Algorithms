import java.io.*;
import java.util.*;

class MiddleOfThree {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(middle(A,B,C));

    }

    static int middle(int A, int B, int C) {
        // code here
        int res = 0;
        if ((A > B && A < C) || (A < B && A > C)) {
            res = A;
        }

        if ((B > A && B < C) || (B < A && B > C)) {
            res = B;
        }

        if ((C > A && C < B) || (C < A && C > B)) {
            res = C;
        }

        return res;

    }
}
