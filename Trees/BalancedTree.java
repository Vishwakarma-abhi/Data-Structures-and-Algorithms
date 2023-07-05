import java.util.*;

public class BalancedTree extends Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = create();

        boolean isBalanced = isBalanced(root);

        if (isBalanced) {
            System.out.println("Balanced tree");
        } else {
            System.out.println("Not balanced Tree");
        }
    }

    // Function to check whether a binary tree is balanced or not.
    private static boolean isBalanced(Node root) {
        // Your code here

        int lh;
        int rh;

        if (root == null)
            return true;

        lh = height(root.left);
        rh = height(root.right);

        if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    // fucntion for calculating the height
    private static int height(Node root) {

        if (root == null)
            return 0;

        return Math.max(1 + height(root.left), 1 + height(root.right));
    }
}
