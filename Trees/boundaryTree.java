import java.util.*;

public class boundaryTree extends Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = create();

        /*
         * The boundary includes
         * 
         * left boundary (nodes on left excluding leaf nodes)
         * leaves (consist of only the leaf nodes)
         * right boundary (nodes on right excluding leaf nodes)
         */

        printBoundary(root);
    }

    // Function to do boundary traversal
    private static void printBoundary(Node root) {
        if (root == null)
            return;

        System.out.println(root.data);
        // Print the left boundary excluding the leaf nodes
        printBoundaryLeft(root.left);

        // print leaf nodes first left then right
        printLeaf(root.left);
        printLeaf(root.right);

        // Now print the right boundary excluding the leaf nodes
        printBoundaryRight(root.right);

    }

    private static void printBoundaryRight(Node node) {
        if (node == null) {
            return;
        }
        if (node.right != null) {
            // to ensure the down top order first print then add the call
            printBoundaryRight(node.right);

            System.out.print(node.data + " ");
        } else if (node.left != null) {
            printBoundaryRight(node.left);

            System.out.print(node.data + " ");
        }
    }

    private static void printLeaf(Node node) {
        if (node == null)
            return;

        printLeaf(node.left);

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        printLeaf(node.right);
    }

    private static void printBoundaryLeft(Node node) {

        if (node == null) {
            return;
        }
        if (node.left != null) {
            // to ensure the top down order first print then add the call
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.right);
        }
    }
}
