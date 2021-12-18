import java.util.Scanner;

class Count_set_bits
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i=1,count=0;
        while(n != 0)
        {
            if((n & i) != 0)
            {
                count++;
            }
            n=n>>1;
           
            

        }
        System.out.println("Number of set bits in the number = "+count);
    }
}