/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        int arr[]=new int[7];

        while(T!=0)
        {
            int good=0,rainy=0;
            for(int i=0;i<arr.length;i++)
            {
                
                
                arr[i]=sc.nextInt();
                if(arr[i]==1)
                {
                    good++;
                }
                else{
                    rainy++;
                }
            }
            if(good>rainy)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
	}
}
