import java.util.Scanner;

public class kth_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        kth_bit f1=new kth_bit();
        kth_bit f2=new kth_bit();
        int num,k;
        System.out.println("Enter a number ");
        num=sc.nextInt();
        System.out.println("Enter the position of the kth bit to check set or not");
        k=sc.nextInt();
        
        System.out.println("Enter Your Method Choice ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                f1.right_shift(num,k);
                break;
            case 2:
                f2.left_shift(num,k);
                break;
        }
        
        
    }
    //1 is Powerful number
    void right_shift(int num,int k)
    {
        int mask=num>>(k-1);    //masking    using right shift operator
        /* 00...101
           00...010
        &  00...001
           00.....0 */

        if((mask & 1) == 1)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    void left_shift(int num,int k)
    {
        int mask=1<<(k-1);
        if( (num & mask) != 0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
