
import java.util.Scanner;

public class height_btree {
    public static void main(String[] args) {
        Node root = create();

        int height = height_tree(root);

        System.out.println("Height of the tree = "+ height);
    }

    static int height_tree(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return Math.max(1 + height_tree(root.left),1 + height_tree(root.right));

    }
    
    
    
    static Node create()
    {
        Node root  =  null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data");
        int value = sc.nextInt();

        if(value == -1)
        {
            return null;
        }
        root =  new Node(value);

        System.out.println("Enter the left child of  "+ value);
        root.left = create();

        System.out.println("Enter the right child of  "+ value);
        root.right = create();

        return root;
        

    }


    static class Node{
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data = data;
        }
    }

    
}
