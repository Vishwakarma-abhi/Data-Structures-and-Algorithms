import java.util.Scanner;

public class arr_rec {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }

        display(arr,0);
    }

    static void display(int[] arr, int i)
    {
        if(i >= arr.length-1)
        {
            System.out.println(arr[i]+"\nPrinting Finished");
        }
        else
        {
            System.out.print(arr[i]+"  ");
            i = i + 1;
            display(arr, i);
        }
    }   
}
