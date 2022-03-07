import java.util.*;

public class Counting_Nodes_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root =  create();

        int Total_nodes =  counting_nodes(root);
        System.out.println("Total Number of Nodes in the tree  = "+ Total_nodes);
        
    }

    public static int counting_nodes(Node root)
    {
        if(root ==  null)
        {
            return 0;
        }
        // Counting the total nodes =  the left aub tree nodes  +  the right sub tree nodes
        
        return 1 + counting_nodes(root.left) + counting_nodes(root.right);


    }

    static Node create()
    {
        Node root  = null;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the root data");
        int value = sc.nextInt();

        if(value == -1)
        {
            return null;
        }
        root =  new Node(value);

        System.out.println("Enter the left child of "+ value);
        root.left = create();

        System.out.println("Enter the right child of "+ value);
        root.right = create();

        return root;
        
    }
    


    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
        }
    }
}
