
import java.util.*;

public class Average_LevelOrder extends Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating Tree
        Node root = create();
        List<Double> list = new LinkedList<>();

        // now here we will use Level order traveral using for loop
        // In this program we will be calculating the average of node at each level of
        // the Tree
        // BFS --> Level Order Traversal Approach
        // Time complexity -> O(n) Space -> O(1)
        Level_avg(list, root);

        System.out.println(list);
    }

    // now we will create a fn. for calculating avg at each level
    public static void Level_avg(List<Double> list, Node root) {
        // now here we will have a Queue Data structure for keeping track nodes of each
        // level
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Double sum = 0.0;

        while (!queue.isEmpty()) {
            // Levelnum will keep track about how how many times we have to stay in that
            // level
            sum = 0.0;
            int levelnum = queue.size();
            // System.out.print(levelnum + " ");
            Node currNode;

            for (int i = 0; i < levelnum; i++) {

                currNode = queue.poll();
                // rather than puttin them in sublist
                // calculate the sum here
                // System.out.println(currNode.data);
                if (currNode.data != -1)
                    sum = sum + currNode.data;

                if (currNode.left != null) {
                    queue.add(currNode.left);
                }

                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
            // Now calculate average
            // since it is average of Binary Tree so we know at each only 2 children or
            // nodes will be present
            // System.out.println(sum + " ");
            list.add(sum / levelnum);

        }

    }
}
