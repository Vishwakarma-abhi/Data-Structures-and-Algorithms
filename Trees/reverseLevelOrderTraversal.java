import java.util.*;

public class reverseLevelOrderTraversal {

    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();
        // List<List<Integer>> list = new ArrayList<>();
        // list.add(new ArrayList<Integer>(root.data));

        // Using Iteration in revrese by calculating the height
        System.out.println("Reverse Level Order Traversal Using height");
        reverseLevelOrder(root);

        // Approach - 2 Simply do level order traversal using Queue and then reverse it
        // using Collections.reverse()

        // Approach - 3 using Stack
        /*
         * - Algorithm
         * - Do Normal Level Order traversal
         * - Add the nodes in the Stack
         * - then afer queue is empty
         * nd we came back
         * - Iterate through the stack and then add values in the final result list
         * 
         */

    }

    private static void reverseLevelOrder(Node root) {

        // First calculate the height
        int height = cal_Height(root);
        ArrayList<Integer> list = new ArrayList<>();
        // now we have to iterate in reverse order

        // only differene from normal level order traversal
        for (int i = height; i >= 1; i--) {

            add_Current_Level_Values(root, i, list);
        }
        System.out.println(list);

    }

    private static void add_Current_Level_Values(Node root, int currLevel, ArrayList<Integer> list) {

        if (root == null)
            return;

        if (currLevel == 1) {
            list.add(root.data);
        } else if (currLevel > 1) {

            // access the first the right subtree and then the left subtree
            add_Current_Level_Values(root.right, currLevel - 1, list);
            add_Current_Level_Values(root.left, currLevel - 1, list);

        }
    }

    private static int cal_Height(Node root) {

        if (root == null)
            return 0;
        return 1 + Math.max(cal_Height(root.left), cal_Height(root.right));
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