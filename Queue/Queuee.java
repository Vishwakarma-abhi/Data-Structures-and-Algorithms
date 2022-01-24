
import java.io.*;
import java.util.*;
class queue
{
    int Que[];
    int top,rear,len;

    queue(int size)
    {
        Que=new int[size];
        top = 0;
        rear = -1;
        len=size;
    }

    void enqueue(int value)
    {
        if (rear == len-1)
        {
            System.out.println("OverFlow");
        }
        else
        {
            Que[++rear]=value;
        }
    }

    int dequeue()
    {
        if(top == -1){
            System.out.println("Stack is empty");
            return -9;
        }
        else if(top == rear)
        {
            top=rear=-1;
            return -9;
        }
        else
        {
            return Que[top++];
        }
    }

    void display()
    {
        if (top == -1)
        {
            System.out.println("No Data found to display");
            return;
        }
        else
        {
            
            for (int i = top;i<=rear;i++)
            {
                System.out.println(Que[i]);
            }

        }
    }


}


//Queue data structure 
public class Queuee 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        queue que=new queue(10);
        System.out.println("\n");
        System.out.println("Queue");
        //Adding elements in the queue
        que.enqueue(5);
        que.enqueue(7);
        que.enqueue(9);
        que.enqueue(11);
        que.enqueue(8);
        
        //quueue before deletion process
        que.display();
        int item = que.dequeue();
        System.out.println("Deleted element of the queue"+item);
        que.display();
       
    }

    
}
