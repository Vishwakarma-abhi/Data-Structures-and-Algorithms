import java.util.Scanner;

public class nth_node {
    public static void main(String[] args) {
        char ch;
        Node root = null;
        Scanner sc =new Scanner(System.in);
        
        //Adding elements in the Binary Search  tree

        do {

            System.out.println("Enter the data You want to insert in BST");
            int data =  sc.nextInt();
            root = create(root,data);
            System.out.println("Enter Y or y for inserting");
            ch = sc.next().charAt(0);
         

        } while (ch=='y' || ch == 'Y');
        
        System.out.println("Our Binary Search tree");
        inOrder(root);
        System.out.println();

        System.out.println("Enter the nth node you want to find");
        int n = sc.nextInt();
        NthInorder(root, n);
        


    }


    static void NthInorder( Node node, int n)
    { 
        int count = 0;
        if (node == null)
            return;
    
        if (count <= n) {
            /* first recur on left child */
            NthInorder(node.left, n);
            count++;
    
            // when count = n then print element
            if (count == n)
                System.out.printf("%d ", node.data);
    
            /* now recur on right child */
            NthInorder(node.right, n);
        }
    }








     //Inorder Traversal

    static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

    //Creation of Node

    static Node create(Node root,int data)
    {
        
        if(root ==  null)
        {
            return new Node(data);
        }

        //checking if data < root.data if yes then added to left subree
        if(data <= root.data)
        {
            root.left = create(root.left,data);
        }
        //checking if data >= root.data if yes then added to right subtree
        else if(data >= root.data)
        {
            root.right =  create(root.right,data);
        }
        

        
        return root;

    }

    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
        }
    }
    
}
