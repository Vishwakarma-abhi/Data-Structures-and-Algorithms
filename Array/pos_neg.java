import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr);
        
        int res[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0)
            {
                if(i % 2 == 0)
                {
                    res[i+1] = arr[i];
                }
            }
            else
            {
                res[i] = arr[i];
            }
        }
        display(res);

        
    }

    static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
    
}
