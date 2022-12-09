import java.util.*;

public class Array_trees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Array_imp obj = new Array_imp();

        obj.Root("A");

        obj.set_right("C", 0);
        obj.set_right("D", 1);
        obj.set_right("E", 2);
        obj.set_right("F", 1);
        obj.display();
    }

}

// class 2
// helper class
class Array_imp {

    // member variable of this class
    // static int root-0;
    static String[] str = new String[10];

    // creating root node
    public void Root(String key) {

        str[0] = key;
    }

    // Method for creatinng left child of root
    public static void set_left(String key, int root) {

        // position of left child of root in the array
        int t = (root * 2) + 1;

        if (str[root] == null) {
            System.out.println("No parent found");
        } else {
            str[t] = key;
        }

    }

    public static void set_right(String key, int root) {

        // position of left child of root in the array
        int t = (root * 2) + 2;

        if (str[root] == null) {
            System.out.println("No parent found");
        } else {
            str[t] = key;
        }

    }

    public static void display() {

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + "  ");
        }

    }

}