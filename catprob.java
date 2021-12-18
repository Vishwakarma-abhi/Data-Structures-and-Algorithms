import java.util.Scanner;

class catprob
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M,R,temp,start=0;
        System.out.println("Enter the number of cats");
        M=sc.nextInt();
        int arr[]=new int[M];
        int cat[]=new int[M];
        System.out.println("Enter the sequence of the cats");
        for(int i=0;i<=M-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=M-1;i++)
        {
            for(int j=i+1;j<=M-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        for(int i=0;i<=M-1;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}