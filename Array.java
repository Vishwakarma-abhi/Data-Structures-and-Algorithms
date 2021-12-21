import java.util.Scanner;

import java.io.*;
class Array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Fixed sized array
        int arr[]=new int[5];
        System.out.println("Enter 5 elements");
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before deletion");
        for (int i=0;i<5;i++)
        {
           System.out.println(arr[i]);
        }

        //Deleting Element at some position
        System.out.println("Enter the positoin of the element You want to delete");
        int pos=sc.nextInt();
        int len=arr.length;
        if(pos >len || pos <=0)
        {
            System.out.println("Invalid");
        }
        else
        {
            for(int i=pos-1;i <len-1;i++)
            {
                arr[i]=arr[i+1];
            }
            len--;
        }
        
        System.out.println("Arraya after deletion");
        for (int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
        
            

        
    }
}