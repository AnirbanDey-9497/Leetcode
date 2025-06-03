package src.Trees;

import java.util.ArrayList;
import java.util.Stack;

public class Iterative_PostOrder {
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
    public  static ArrayList<Integer> iterativeInOrderTraversal(Node root)
    {
        ArrayList<Integer> result= new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        if(root==null)
        {
            return result;
        }
        Node lastVisited=null;
        Node current =root;
        while(current!=null ||!stack.isEmpty())
        {
            if(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            else
            {
                Node peekNode=stack.peek();
                if(peekNode.right!=null && lastVisited!=peekNode.right)
                {
                    current=peekNode.right;
                }
                else
                {
                    result.add(peekNode.data);
                    lastVisited=stack.pop();
                }
            }
        }
        return result;
    }
}
