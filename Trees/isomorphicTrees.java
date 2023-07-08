
import java.util.*;

public class isomorphicTrees extends Tree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tree 1
        Node root1 = create();
        Node root2 = create();

        if (isIsomorphic(root1, root2)) {
            System.out.println("Both Trees are Isomorphic");
        } else {
            System.out.println("Not Isomorphic");
        }

    }

    static boolean isIsomorphic(Node root1, Node root2) {
        // code here.

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data != root2.data)
            return false;

        // four conditions
        boolean cond1 = isIsomorphic(root1.left, root2.left);
        boolean cond2 = isIsomorphic(root1.left, root2.right);
        boolean cond3 = isIsomorphic(root1.right, root2.left);
        boolean cond4 = isIsomorphic(root1.right, root2.right);

        return (cond1 && cond2) || (cond3 && cond4);

    }
}
