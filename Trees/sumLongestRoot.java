import java.util.*;

public class sumLongestRoot extends Tree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = create();
        sumOfLongRootToLeafPath(root);
        System.out.println(maxSum);

    }

    static int maxSum = 0;

    public static int sumOfLongRootToLeafPath(Node root) {
        int len = 0, maxlen = 0, sum = 0;
        maxSum = Integer.MIN_VALUE;
        sumOfLongestRoot(root, len, maxlen, sum);
        return maxSum;
    }

    private static void sumOfLongestRoot(Node root, int len, int maxlen, int sum) {

        if (root == null) {
            if (len > maxlen) {
                maxlen = len;
                maxSum = sum;
            } else if (len == maxlen) {
                maxSum = Math.max(sum, maxSum);
            }
            return;
        }
        sum += root.data;
        sumOfLongestRoot(root.left, len + 1, maxlen, sum);
        sumOfLongestRoot(root.right, len + 1, maxlen, sum);

    }
}
