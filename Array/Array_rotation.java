import java.util.Scanner;

class Array_rotation
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Array_rotation obj =new Array_rotation();
        int arr[] = { 1,2,3,4,5,6,7};

        System.out.println("Enter the number to rotate the element ");
        int k = sc.nextInt();;

        obj.Naive(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }

    }

    public static void Naive(int[] arr, int k)
    {
        int temp[] = new int[k];
        for(int i = 0; i < k; i++)
        {
            temp[i] = arr[i];
        }

        for (int i = k  ; i < arr.length; i++) 
        {
            arr[k - 2] = arr[k];
            
        }
        int len = arr.length;
        int j = 0;
        for (int i = len - 2 ; i < arr.length; i++) {
            arr[i] = temp[j];
            
        }
    }
}