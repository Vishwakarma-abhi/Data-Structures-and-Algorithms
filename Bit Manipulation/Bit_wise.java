import java.util.Scanner;

public class Bit_wise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int ch,x,y;
        System.out.println("Entet your choice for the operations");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter two numbers ");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(x&y);
            case 2:
                System.out.println("Enter two numbers ");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(x|y);
            case 3:
                System.out.println("Enter two numbers ");
                x=sc.nextInt();
                y=sc.nextInt();
                System.out.println(x^y);
            case 4:
                System.out.println("Enter two numbers ");
                x=sc.nextInt();
                System.out.println(~x);
        }
    }
    
}
