package src.Trees;

public class PreOrder {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println("Pre-order traversal:");
        preOrderTraversal(root);
    }

    public static void preOrderTraversal(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

}
