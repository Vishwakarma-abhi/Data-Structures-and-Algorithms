import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=0,k;
        for(int i=0;i<=n-1;i++)
        {
            k=i;
            for(int j=0;j<=n-1;i++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    k=j;

                }
            }
            arr[k]=arr[i];
            a[i]=min;
        }
    }
    
}
