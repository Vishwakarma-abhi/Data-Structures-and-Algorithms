import java.util.*;

public class move_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };

        // Appraoch - 1 use two arrays
        ArrayList<Integer> poslist = new ArrayList<>();
        ArrayList<Integer> neglist = new ArrayList<>();

        // Time - O(n) Space -> O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                poslist.add(arr[i]);
            } else {
                neglist.add(arr[i]);
            }
        }
        // System.out.println(poslist);
        // System.out.println(neglist);
        int i;

        for (i = 0; i < poslist.size(); i++) {
            arr[i] = poslist.get(i);
        }
        System.out.println(neglist.get(0));

        for (int j = 0; j < neglist.size(); j++) {
            arr[i] = neglist.get(j);
            i++;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }

}
