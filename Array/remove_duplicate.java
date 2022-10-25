import java.util.*;

public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 3, 4, 4, 5 };
        int len = arr.length;

        remove_duplicate object = new remove_duplicate();

        System.out.println("Original Array");
        object.display(arr, len);
        // object.remove_dup(arr,len);
        System.out.println();
        int j = 0, count = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.containsValue(arr[i])) {
                set.put(i, arr[i]);
                arr[j++] = arr[i];
            } else {
                count++;
            }
        }
        len = len - count;

        System.out.println("Array after removing duplicates");
        object.display(arr, len);

    }

    void display(int arr[], int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}

// //Removing Duplicates function
// void remove_dup(int arr[], int len)
// {
// remove_duplicate caller = new remove_duplicate();

// for (int j = 0; j < arr.length-1; j++) {
// if(arr[j] == arr[j+1])
// {
// caller.shift(arr,len,j+1);

// }
// }

// }

// //Shifting function

// void shift(int arr[], int len , int index)
// {
// if(index < 0)
// {
// System.out.println("Invalid position");
// }

// for(int i = index;i < len-1 ; i++)
// {
// arr[i] = arr[i+1];
// }
// len--;
// }
