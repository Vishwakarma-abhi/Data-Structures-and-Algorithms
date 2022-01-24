import java.util.Arrays;
import java.util.Scanner;

public class Array_code {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[6];
        Array_code Obj=new Array_code();
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        
        int len = arr.length;

        

        Obj.max(arr);
        Obj.min(arr);
        Obj.search(arr);
        Obj.Insert(2,arr);
        

    }

    
    void Insert(int pos, int[] arr)
    {
        System.out.println("Enter the data to be inserted");
        int data=sc.nextInt();
        int len=arr.length;
        int idx=pos-1;
        for(int i = len-1 ;i>=idx;i--)
        {
            arr[i+1]=arr[i];
            
        }
        arr[idx] = data;


    }
    void search(int[] arr)
    {
        System.out.println("Enter the data u want to search");
        int data=sc.nextInt();
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == data)
            {
                System.out.println("Found Item");
                break;
            }
        }






    }


    void min(int[] arr)
    {
        Arrays.sort(arr);
        System.out.println("Minimum number in the array is "+arr[0]);
    }
    void max(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        System.out.println("MAximum Number in the array is "+ max);
    }
    
}
