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
        
    }

    void preorder(Node root)
    {
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}