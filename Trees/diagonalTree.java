import java.util.*;

public class diagonalTree extends Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // constructing tree
        Node root = create();

        /*
         * Program to print the diagonal element
         * Observations
         * - First give priority to to root and root.right
         * - meanwhile keep adding left if exist
         */
        ArrayList<Integer> list = new ArrayList<>();
        list = printDiagonal(root);
        System.out.println("Diagonal Elements of the Tree");
        System.out.println(list);

    }

    private static ArrayList<Integer> printDiagonal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        // so i have my answer as list
        // Construct a queue for storing left subtree node
        Queue<Node> leftQueue = new LinkedList<>();
        Node node = root;

        while (node != null) {

            // now we add the curr root value
            list.add(node.data);

            // now check if the root.left exist
            // if yes then add it to leftqueue
            if (node.left != null) {
                leftQueue.offer(node.left);

            }
            // now check if it is a right subtree is there or not
            if (node.right != null) {
                node = node.right;
            }
            // now if the queue is not empty then take out the peek element and traverse
            // that
            // also remove it from the queue
            else {
                if (!leftQueue.isEmpty()) {
                    Node top = leftQueue.peek();
                    node = top;
                    leftQueue.remove();

                }

                else {
                    node = null;
                }
            }

        }
        return list;

    }
}
