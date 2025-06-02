package src.Trees;

public class PostOrder {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println("Pre-order traversal:");
        postOrderTraversal(root);
    }

    public static void postOrderTraversal(Node node)
    {
        if(node==null)
        {
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data+" ");
    }
}
