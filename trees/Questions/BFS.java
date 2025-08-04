package trees.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
    }

    // BFS. Q1) Binary Tree level order traversal.
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); // List of List (the outer list)

        if (root == null) { // Base case.
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>(); // here the type is TreeNode as we are storing the tree nodes in queue.
        queue.offer(root); // store the first element root.

        while (!queue.isEmpty()) {
            int levelsize = queue.size(); // size of every level.
            List<Integer> currentlevel = new ArrayList<>(levelsize); // Internal list
            for (int i = 0; i < levelsize; i++) { // Iterate the every level.
                TreeNode currentNode = queue.poll(); // removing the front Node from the queue and storing it in "currentNode"
                currentlevel.add(currentNode.val); // Storing the values of every level.
                if(currentNode.left != null){
                    queue.offer(currentNode.left); // adding the left node in the queue
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right); // adding the right node in the queue
                }
            }
            result.add(currentlevel); // adding the internal list in the outer list
        }
        return result; // returning the outer list
    }

    // Q2) Binary Tree level order traversal II.
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelSize);
            for(int i=0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentlevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.addFirst(currentlevel);
        }
        return result;
    }

    // Google. Q3) Average of Levels in Binary Tree
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            double averageLevel = 0; // initializing averageLevel to 0
            for(int i=0; i<levelsize; i++){
                TreeNode currentNode = queue.poll();
                averageLevel += currentNode.val; // adding the value of currentNode in averageLevel
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            averageLevel = averageLevel/levelsize; // calculating the average
            result.add(averageLevel);
        }
        return result;
    }

    // Google. Q4) Level order Successor of a node.
    public TreeNode findSuccessor(TreeNode root, int key){
        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
            if(currentNode.val == key){
                break;
            }
        }
        return queue.peek();
    }
}