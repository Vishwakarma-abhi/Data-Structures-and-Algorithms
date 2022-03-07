import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class level_order {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();

        System.out.println("Level Order Traversal ");
        level_order_tree(root);
	}

    static void level_order_tree(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node temoNode =  q.poll();
            System.out.print(temoNode.data+"  ");

            if(temoNode.left != null)
            {
                q.add(temoNode.left);
            }
            
            if(temoNode.right != null)
            {
                q.add(temoNode.right);
            }
        }

    }
	static Node createTree() {
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
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