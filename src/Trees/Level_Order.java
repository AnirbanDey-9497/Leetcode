package src.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Level_Order {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        ArrayList<ArrayList<Integer>> result= levelOrderTraversal(root);



        System.out.println("Level Order Traversal:");
        for (ArrayList<Integer> level : result) {
            System.out.println(level);
        }

    }
    public static ArrayList<ArrayList<Integer>> levelOrderTraversal(Node root)
    {
        ArrayList<ArrayList<Integer>> levels=new ArrayList<>();
        Queue<Node> queue= new LinkedList<>();
        if(root==null)
        {
            return levels;
        }
        queue.add(root);
        while (!queue.isEmpty())
        {
            int levelSize= queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();
            for(int i=0; i<levelSize; i++)
            {
                Node currentNode= queue.remove();
                currentLevel.add(currentNode.data);
                if(currentNode.left!=null)
                {
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null) {
                    queue.add(currentNode.right);
                }
            }
            levels.add(currentLevel);
        }
        return levels;

    }
}
