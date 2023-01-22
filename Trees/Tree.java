
import java.util.*;

public class Tree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = create();

        // Preorder traversal
        System.out.println("\nPreorder Traversal");
        preorder(root);

        System.out.println();
        // PostOrder traversal
        System.out.println("\nPost Order traversal");
        postorder(root);
        System.out.println();
        // Inprder traversal
        System.out.println("\n Inorder Traversal");
        inorder(root);

    }

    // creating and taking user input for the tree
    static Node create() {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data in the node ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }
        root = new Node(value);

        System.out.println("Enter the left child of " + value);
        root.left = create();

        System.out.println("Enter the right child of" + value);
        root.right = create();

        return root;

    }

    static void preorder(Node root) {
        // termination condition [ root left right ]
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        // left root right
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void inorder(Node root) {
        // left root right
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    int countnode(Node root) {
        if (root == null)
            return 0;
        return (1 + countnode(root.left) + countnode(root.right));
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;

    }
}