
import java.util.ArrayList;
import java.util.Scanner;

public class leaf_btree {
    public static void main(String[] args) {
        Node root = create();
        ArrayList<Integer> arr = new ArrayList<>();
        int height = leaf_tree(root, arr);

        System.out.println("No. of Leaf Nodes in the tree = " + height);
        System.out.println("Leaf nodes are -> " + arr);
    }

    static int leaf_tree(Node root, ArrayList<Integer> arr) {
        if (root == null) {

            return 0;
        }

        if (root.left == null && root.right == null) {
            arr.add(root.data);
            return 1;
        }
        return leaf_tree(root.left, arr) + leaf_tree(root.right, arr);
    }

    static Node create() {
        Node root = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }
        root = new Node(value);

        System.out.println("Enter the left child of  " + value);
        root.left = create();

        System.out.println("Enter the right child of  " + value);
        root.right = create();

        return root;

    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

}
