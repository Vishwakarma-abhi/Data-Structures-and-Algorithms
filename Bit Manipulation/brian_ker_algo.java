import java.util.Scanner;
public class brian_ker_algo 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        int count=0;

        while(n > 0)
        {
            n=n&(n-1);
            count++;
        }
        System.out.println("Total number of set bits = "+count);    
    }
    

    
}
