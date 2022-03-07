import java.util.*;

public class Mirror_image {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root  = create();
        
        System.out.println("Original Tree");
        inOrder(root);
        
        System.out.println("\nMirror image");
        mirror(root);
        inOrder(root);
    }

    //Mirror image of the Binary tree
    public static void mirror(Node root)
    {
        if(root == null)
        {
            return;
        }
        //Mirror Image 
        Node temp = root.left;
        root.left =  root.right;
        root.right =  temp;
        mirror(root.left);
        mirror(root.left);
    }

    public static Node create() {
        Node root  = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the root data");
        int value =  sc.nextInt();

        if(value == -1)
        {
            return null;
        }

        root = new Node(value);

        System.out.println("Enter the left child of "+ value);
        root.left =  create();

        System.out.println("Enter the right child of "+ value);
        root.right =  create();
        return root;
    }



    static void inOrder(Node root)
    {
        if(root ==  null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }


    static class Node{
        int data;
        Node left, right;

        public Node(int data)
        {
            this.data = data;
        }
    }    
}
