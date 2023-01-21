import java.util.*;

public class level_order {

	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		Node root = createTree();
		// List<List<Integer>> list = new ArrayList<>();
		// list.add(new ArrayList<Integer>(root.data));

		System.out.println("Level Order Traversal ");
		System.out.println("Approach 1 --> Recursion");
		// Approach 1 using recursion
		level_order_tree(root);
		System.out.println("\nApproach 2 --> Iterative");
		// Approach 2 using iteration
		System.out.println(levelOrder(root));
	}

	public static List<List<Integer>> levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		List<List<Integer>> list = new LinkedList<List<Integer>>();

		if (root == null)
			return list;

		int which_level = 0;

		queue.offer(root);

		while (!queue.isEmpty()) {
			// levelNum -> Keeps tracks about how many elements are there in the currlevel
			System.out.println("Level -> " + which_level);
			int levelNum = queue.size();

			// this data structure stores all the element at each level
			List<Integer> sublist = new LinkedList<Integer>();

			// this will help to traverse or reach every node at each Level
			for (int i = 0; i < levelNum; i++) {
				// taking out the current root from the queue
				Node currNode = queue.poll();
				// Adding the element at current level
				sublist.add(currNode.data);

				// now we will check for left side i.e. next level
				// queue.peek --> root
				if (currNode.left != null) {
					queue.offer(currNode.left);
				}
				// similarly for right side
				if (currNode.right != null) {
					queue.offer(currNode.right);
				}

			}
			// sublist contains the elements in the currLevel and it is added level wise in
			// final list
			list.add(sublist);

			which_level++;

		}

		return list;

	}

	static void level_order_tree(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node temoNode = q.poll();
			System.out.print(temoNode.data + "  ");

			if (temoNode.left != null) {
				q.add(temoNode.left);
			}

			if (temoNode.right != null) {
				q.add(temoNode.right);
			}
		}

	}

	static Node createTree() {

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