import java.util.Scanner;

public class MaxDepth_BT extends Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take the help of the tree class for creating the Tree

        Node root = create();
        System.out.println("Maximum Depth of the Binary Tree --> " + maxDepth(root));

    }

    public static int maxDepth(Node root) {

        // called the function which is for maximum depth
        // Time complexity -> O(n)
        // Space complexity -> O(h) h-> height of the binary tree
        return calculate_Maxdepth(root, Integer.MIN_VALUE);
    }

    public static int calculate_Maxdepth(Node root, int max) {
        // when the root reaches a leaf node we return 0
        if (root == null) {
            return 0;
        }
        // here we first calculate the depth of left subtree and right subtree and then
        // compare them which is max and store it in max variable
        // here we have giving choice that max (root ) should follow that path whose
        // distance is more i.e depth is more
        // either left or right side
        // added 1 because height of the root is also taken
        return max = Math.max(1 + calculate_Maxdepth(root.left, max), 1 + calculate_Maxdepth(root.right, max));
    }

}
