import java.util.Scanner;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Tree
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Tree obj=new Tree();
        Node root=new Node();
        root=obj.create(root);
        // root.left = new Node(16);
        // root.right = new Node(6);
        // root.left.left=new Node(25);
        // root.left.right=new Node(19);
        // root.left.right.right=new Node(155);
        
        //Preorder traversal
        System.out.println("Preorder Traversal");
        obj.preorder(root);
        //PostOrder traversal
        System.out.println("\nPost Order traversal");
        obj.postorder(root);
        //Inprder traversal
        System.out.println("\n Inorder Traversal");
        obj.inorder(root);
        //Total no. of Nodes 
        System.out.println("\nTotal no. of Nodes = "+obj.countnode(root));
        //Total no. of Leaf nodes
        System.out.println("\nTotal no. of leaf nodes"+obj.count_leaf(root)); //to be solved
    }

    //creating and taking user input for the tree
    int create(Node root)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data in the node ");
        int value = sc.nextInt();
        if(value == -1)return 0;
        
        root.data = value;
        System.out.println("Enter the left child value");
        root.left=create(root.left);
        
        System.out.println("Enter the right child value");
        root.right=create(root.right);

        return root;

        


    }
    void preorder(Node root)
    {   
        //termination condition  [ root left right ]
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root)
    {
        //left root right
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    void inorder(Node root)
    {
        //left root right
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    int countnode(Node root)
    {
        if(root == null)return 0;
        return ( 1 + countnode(root.left) + countnode(root.right));
    }
}