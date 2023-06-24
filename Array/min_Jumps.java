
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class min_Jumps {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
    }

    public static int minJumps(int[] arr) {
        // your code here

        int steps = arr[0];
        int jump = 1;
        int maxReach = arr[0];

        if (arr[0] == 0)
            return -1;
        else if (arr.length == 1)
            return 0;

        else {
            for (int i = 1; i < arr.length; i++) {

                if (i == arr.length - 1)
                    return jump;
                maxReach = Math.max(maxReach, arr[i] + i);

                steps--;

                if (steps == 0) {
                    jump++;
                    if (i >= maxReach)
                        return -1;

                    steps = maxReach - i;
                }
            }
        }

        // if(pos >= arr.length-1)
        // {
        // return jump;
        // }
        return -1;
    }

}
