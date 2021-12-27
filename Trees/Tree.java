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

        Node root=new Node(20);
        root.left = new Node(16);
        root.right = new Node(6);
        root.left.left=new Node(25);
        root.left.right=new Node(19);
        root.left.right.right=new Node(155);
        Tree obj=new Tree();
        //Preorder traversal
        System.out.println("Preorder Traversal");
        obj.preorder(root);
        System.out.println("\nPost Order traversal");
        obj.postorder(root);
        System.out.println("\n Inorder Traversal");
        obj.inorder(root);
        System.out.println("\nTotal no. of Nodes = "+obj.countnode(root));
        System.out.println("\nTotal no. of leaf nodes"); //to be solved
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