
public class MinDepth extends Tree {
    public static void main(String[] args) {

        // here also we are using Tree class for creating the Tree

        Node root = create();

        System.out.println("Minimum Depth of the Binary Tree --> " + calculate_MinDepth(root));

    }

    public static int calculate_MinDepth(Node root) {

        // if the root reaches the leaf node or left or right tree is null we return 0
        // as distance
        // check no node
        if (root == null)
            return 0;

        // Base case
        // when it encounters a leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;

        // if left subtree is not null
        if (root.left != null) {
            return 1 + calculate_MinDepth(root.left);
        }

        if (root.right != null) {
            return 1 + calculate_MinDepth(root.right);
        }

        // either left path is min or right it choosed the minimum one while traversing
        return Math.min(calculate_MinDepth(root.left), calculate_MinDepth(root.right));
    }
}
