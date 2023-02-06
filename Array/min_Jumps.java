
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class min_Jumps {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            long ans = sumOfDivisors(N);
            System.out.println(ans);
        }
    }

    static static long sumOfDivisors(int N) {
        // code here

        long sum = 0, fsum = 0;

        for (int i = 1; i <= N + 1; i++) {
            sum = 0;
            for (int j = 1; j <= N + 1; j++) {
                // if j is a divisor then add it
                if (i % j == 0) {
                    sum += i;
                }
            }
            fsum = sum;

        }
        return fsum;
    }
}
