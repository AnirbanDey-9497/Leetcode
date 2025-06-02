package src.Trees;

public class Inorder {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println("Pre-order traversal:");
        inOrderTraversal(root);
    }

    public static void inOrderTraversal(Node node)
    {
        if(node==null)
        {
            return;
        }

        inOrderTraversal(node.left);
        System.out.println(node.data+" ");
        inOrderTraversal(node.right);
    }
}
