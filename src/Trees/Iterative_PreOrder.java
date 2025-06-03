package src.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class Iterative_PreOrder {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        ArrayList<Integer> result= iterativePreOrderTraversal(root);



        System.out.println("Iterative Pre Order Traversal:"+ result);


    }

    public static ArrayList<Integer> iterativePreOrderTraversal(Node root)
    {
        ArrayList<Integer> result= new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        Stack<Node> stack= new Stack<>();
        stack.push(root);
        while (!stack.isEmpty())
        {
            Node current= stack.pop();
            result.add(current.data);
            if(current.right!=null)
            {
                stack.push(current.right);
            }
            if(current.left!=null)
            {
                stack.push(current.left);
            }
        }
        return result;
    }
}
