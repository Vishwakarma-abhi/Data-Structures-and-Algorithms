import java.util.*;

import javax.swing.tree.TreeNode;

public class diameterBTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = create();

        System.out.println("Original Tree");
        inOrder(root);
        System.out.println("Maximum Diameter Length - > " + diameterOfBinaryTree(root));
        // System.out.println("Optimized Approach Maximum Diameter Length - > " +
        // Optimized_diameterOfBinaryTree(root));

    }
    /*
     * Optimized Approach Time -> O(N) Space - O(N)
     * Optimized solution
     * 
     * int maxDiameter = 0;
     * 
     * public int Optimized_diameterOfBinaryTree(Node root) {
     * 
     * maxDepth(root);
     * return maxDiameter;
     * }
     * 
     * private int maxDepth(TreeNode root) {
     * if (root == null)
     * return 0;
     * 
     * int left = maxDepth(root.left);
     * int right = maxDepth(root.right);
     * Only storing the maximum diameter
     * maxDiameter = Math.max(maxDiameter, left + right);
     * 
     * return Math.max(left, right) + 1;
     * }
     */
    // Brute Force - >O(N^2) Space - O(N)

    public static int diameterOfBinaryTree(Node root) {

        if (root == null)
            return 0;
        // diamter of left subtree
        int ld = diameterOfBinaryTree(root.left);
        // diameter of right subtree
        int rd = diameterOfBinaryTree(root.right);

        // now if the root is included in the diamter
        int distance = height(root.left) + height(root.right) + 1;

        return Math.max(distance, Math.max(ld, rd));

    }

    private static int height(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static Node create() {
        Node root = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the root data");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        root = new Node(value);

        System.out.println("Enter the left child of " + value);
        root.left = create();

        System.out.println("Enter the right child of " + value);
        root.right = create();
        return root;
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }
}
