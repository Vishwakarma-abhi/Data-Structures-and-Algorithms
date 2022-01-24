import java.util.Arrays;
import java.util.Scanner;

public class LinearBinarysearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        LinearBinarysearch obj =new LinearBinarysearch();

        System.out.println("Enter the capacity");
        int capacity = sc.nextInt();

        int arr[] = new int[capacity];

        System.out.println("Enter the size ");
        int size = sc.nextInt();

        System.out.println("Enter elements in the array ");
        for(int i = 0;i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();

        int Lres = obj.Linearsearch(arr, element, size);
        if(Lres == -1)
        {
            System.out.println("Item not found");

        }
        else{
            System.out.println("Item Found at index at  "+Lres);
        }
        

        //Binary Search Arrays should be sorted 
        int res = obj.Binarysearch(arr, element, size);

        if(res == -1)
        {
            System.out.println("Item not found");

        }
        else{
            System.out.println("Item Found at index at  "+res);
        }
    }


    int Linearsearch(int[] arr, int item, int size)
    {
        for(int i = 0;i < size; i++)
        {
            if( arr[i] == item){
                return i;
            }            
        }
        return -1;
    }
    
    int  Binarysearch(int[] arr, int item , int size)
    {
        int low = 0,high = size - 1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == item)
            {
                return mid;
            }
            if(arr[mid] < item)
            {
                low = mid+1;
            }
            else
            {
                high = mid -1;
            }
        }
        return -1;

    }
}
