import java.util.ArrayList;
import java.util.Scanner;

//Problem Statement
/*
 Given an array Arr of N positive integers.
 Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
Note: There can be more than one element in the array which have the same value as its index.
You need to include every such element's index. Follows 1-based indexing of the array. 
 */
public class fixed_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 15, 2, 45, 12, 7 };

        int n = 5;

        ArrayList<Integer> res = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            if (arr[i] == (i + 1)) {
                res.add(i + 1);
            }
        }
        System.out.println(res);
    }

}
