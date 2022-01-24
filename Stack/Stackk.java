import java.io.IOException;
import java.util.Scanner;
class stack
{

    int stk[];
    int top,len;

    //constructor
    stack(int size)
    {
        stk=new int[size];
        top=-1;
        len=size;
    }


    void push(int value)
    {
        if (top >= stk.length){
            System.out.println("OverFlow");
        }
        else{
            stk[++top]=value;
        }
    }
    int pop()
    {
        if(top == -1){
            System.out.println("Stack is empty");
            return -9;
        }
        else
        {
            return stk[top--];
        }
    }
    void display()
    {
        if (top == -1)
        {
            System.out.println("No Data found to display");
        }
        else
        {
            
            for (int i=top;i>=0;i--)
            {
                System.out.println(stk[i]);
            }

        }

    }
}



class Stackk
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        stack s=new stack(100);
        System.out.println("Stack ");
        s.push(5);
        s.push(7);
        s.push(8);
        s.push(10);
        s.push(15);
        s.push(25);
        s.display();

        int item= s.pop();
        System.out.println("Deleted item of the stack ="+ item);
        System.out.println("Stack After deletion of the element");
        s.display();
    }

}
