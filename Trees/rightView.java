import java.util.*;

public class rightView {

    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();
        // List<List<Integer>> list = new ArrayList<>();
        // list.add(new ArrayList<Integer>(root.data));
        ArrayList<Integer> list = new ArrayList<>();
        printrightView(root, list, 0);
        System.out.println(list);
    }

    private static void printrightView(Node root, ArrayList<Integer> list, int level) {

        if (root == null)
            return;
        if (level == list.size()) {
            list.add(root.data);
        }
        printrightView(root.right, list, level + 1);
        printrightView(root.right, list, level + 1);

    }

    private static Node createTree() {

        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}