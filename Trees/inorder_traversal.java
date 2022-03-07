import java.util.*;

public class inorder_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root  = new Node(10);

        root.left = new Node(15);
        root.right = new Node(115);
        root.left.right = new Node(95);
        root.right.right = new Node(65);
        root.left.right.right = new Node(5);
        
    }




    class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data)
        {
            this.data = data;
        }
    }
    
}
