import java.util.*;

public class Zig_Zag extends Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Node
        Node root = create();

        // Now we will call function for Zig Zag Traversal
        List<List<Integer>> list = new LinkedList<>();

        do_zigzag(root, list);

    }

    public static void do_zigzag(Node root, List<List<Integer>> list) {
        // here list will store the result traversal
        // if (root == null)
        // return list;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        int which_level = 1;
        while (!queue.isEmpty()) {

            List<Integer> sublist = new LinkedList<>();

            int levelNum = queue.size();
            // If the level is even then we traverse Left --> Right
            if (which_level % 2 == 0) {
                System.out.println("Right to left");
                for (int i = 0; i < levelNum; i++) {

                    Node currNode = queue.poll();

                    sublist.add(currNode.data);
                    System.out.println(currNode.data);

                    if (currNode.left != null) {
                        System.out.println("Adding Left");
                        queue.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        System.out.println("Adding right");
                        queue.add(currNode.right);
                    }

                }

            }
            // else we traverse Right --> Left
            else {
                System.out.println("Left to Right");
                for (int i = 0; i < levelNum; i++) {
                    Node currNode = queue.poll();

                    sublist.add(currNode.data);
                    System.out.println(currNode.data);

                    if (currNode.right != null) {
                        System.out.println("Adding right");
                        queue.add(currNode.right);
                    }

                    if (currNode.left != null) {
                        System.out.println("Adding left");
                        queue.add(currNode.left);
                    }

                }
            }

            list.add(sublist);
            which_level++;

        }

        System.out.println(list);

    }
}
