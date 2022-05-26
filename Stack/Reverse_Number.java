import java.util.*;

class stack_array {

    int stk[];
    int top, len;

    // constructor
    stack_array(int size) {
        stk = new int[size];
        top = -1;
        len = size;
    }

    void push(int value) {
        if (top >= stk.length) {
            System.out.println("OverFlow");
        } else {
            stk[++top] = value;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -9;
        } else {
            return stk[top--];
        }
    }

}

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits for the number ");
        int digits = sc.nextInt();
        stack_array s = new stack_array(digits);
        int number[] = new int[digits];
        System.out.println("Enter a number ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            s.push(number[i]);
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(s.pop() + " ");
        }

    }

}
