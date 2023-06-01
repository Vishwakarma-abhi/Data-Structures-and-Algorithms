public class sort_012 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 1, 0, 1, 1, 0, 2 };

        //Dutch Flag Algorithm
        // Approach - 1 //Time -> O(n) Space ->O(1)
        int z = 0, o = 0, t = 0;
        // count the number of zeros , ones and two's
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                z++;
            if (arr[i] == 1)
                o++;
            if (arr[i] == 2)
                t++;
        }

        // now add them accoring to counters
        int k = 0;
        while (z > 0) {
            arr[k++] = 0;
            z--;
        }

        while (o > 0) {
            arr[k++] = 1;
            o--;
        }

        while (t > 0) {
            arr[k++] = 2;
            t--;
        }
        System.out.println("Sorted 0-1-2 Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
