package src.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class Iterative_InOrder {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        ArrayList<Integer> result= iterativeInOrderTraversal(root);



        System.out.println("Iterative Pre Order Traversal:"+ result);


    }

    public static ArrayList<Integer> iterativeInOrderTraversal(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> stack= new Stack<>();
        Node current= root;
        while(current!=null || !stack.isEmpty())
        {
            while (current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            result.add(current.data);
            current=current.right;
        }
        return result;
    }
}
