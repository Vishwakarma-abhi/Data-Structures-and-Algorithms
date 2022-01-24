import java.util.Scanner;



public class arrray_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrray_op obj = new arrray_op();

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
        
        
        int element , index = 2;
        System.out.println("Enter the element to be inserted");
        element =sc.nextInt();
        //Insertion at any index
        obj.insert(arr, size , element, index, capacity );
        size++;
        obj.display(arr, size);

        //Deletion from any index


        System.out.println("Enter the index to be deleted");
        int deindex = sc.nextInt(); 
        obj.delete(arr, deindex, size);
        size--;
        obj.display(arr, size);

    }
    int delete(int[] arr, int index,int size)
    {
        if(index < 0)return -1;

        for(int i = index;i < size-1 ; i++)
        {
            arr[i] = arr[i+1];
        }
        return 1;

    }

    int insert(int[] arr, int size , int element ,int index, int capacity)
    {
        if(size >= capacity)return -1;

        for(int i = size - 1 ; i >= index ; i--)
        {
            arr[i+1] =  arr[i];
        }
        arr[index] = element;
        return 1;
    }
    void display(int[] arr,int size)
    {
        for(int i = 0 ; i < size ;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
