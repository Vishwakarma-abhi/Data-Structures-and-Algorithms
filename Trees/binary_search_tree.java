// Binary Search Tree

import java.util.*;

public class binary_search_tree {
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
        
        System.out.println("Enter the data to be searched");
        int key = sc.nextInt();
        
        if(search(root, key) == null)
        {
            System.out.println(key+ "  Not Found");
        }
        else
        {
            System.out.println(key+ " Found ");
        }
        
        System.out.println("Sum of the Nodes in the Tree  = "+sum_nodes(root));
        

      
    }

    //Sum of Nodes
    static int sum_nodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int sum = 0;
        sum += root.data + sum_nodes(root.left)+sum_nodes(root.right);
        
        return sum; 

    }
    //Searching a Key in BST
    static Node search(Node root,int key )
    {
        if(root == null || key == root.data)
        {
            return root;
        }

        else if(key < root.data)
        {
            return search(root.left, key);
        }

        else if(key > root.data)
        {
            return search(root.right, key);
        }
        else
        {
            return null;
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


    static class Node{
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data = data;
        }
    }

    
}
