import java.util.ArrayList;
import java.util.Scanner;

public class lead_similar_trees {
    // need to be optimized
    // problem no. 872
    public static void main(String[] args) {

        Node root1 = create();
        Node root2 = create();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        leafnodes(root1, arr1);
        leafnodes(root2, arr2);

    }

    public static void leafnodes(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        if (root.leftNode == null && root.rightNode == null) {
            arr.add(root.data);
            return;
        }

        leafnodes(root.leftNode, arr);
        leafnodes(root.rightNode, arr);
    }

    public static Node create() {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();

        if (data == -1) {
            return null;

        }

        root = new Node(data);

        System.out.println("Enter the left child");
        root.leftNode = create();

        System.out.println("Enter the right child");
        root.rightNode = create();

        return root;

    }
}

class Node {
    int data;
    Node leftNode;
    Node rightNode;;

    Node(int data) {
        this.data = data;

    }
}
