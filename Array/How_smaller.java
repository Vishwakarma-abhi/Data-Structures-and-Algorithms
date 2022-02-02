// To be Optimized

import java.util.Scanner;

public class How_smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        How_smaller obj =new How_smaller(); 
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] =new int[size];
        
        System.out.println("Enter the elements in the array");
        for(int i = 0 ; i <  size;i++)
        {
            arr[i] = sc.nextInt();
        }
        obj.display(arr, size);
        int result[] = obj.smaller(arr, size);
        System.out.println("\nOur Array is with Smaller frequency");
        obj.display(result, size);
    }
    

    public int[] smaller(int[] nums, int size)
    {
        int[] result =new int[nums.length];
        int count = 0;
        for(int i = 0 ;i < nums.length;i++)
        {
            count = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] > nums[j])
                {
                    ++count;
                }
            }
            result[i] =  count;
        }
        return result;

    }

    public void display(int[] arr , int size)
    {
        for(int i = 0 ; i <  size;i++)
        {
            System.out.print(arr[i]+ "   ");
        }

    }
}
