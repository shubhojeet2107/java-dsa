package trees.Questions;

public class DFS {

    public class TreeNode {
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

    class Node {
        public int val;
        public BFS.Node left;
        public BFS.Node right;
        public BFS.Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, BFS.Node _left, BFS.Node _right, BFS.Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    // Q1) Diameter of a Binary Tree
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        traversal(root);
        return diameter-1;
    }

    public int traversal(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = traversal(node.left);
        int right = traversal(node.right);

        int dia = left+right + 1;
        diameter = Math.max(dia, diameter);
        return Math.max(left, right) +1;
    }

    // Q2) Invert Binary Tree
    public TreeNode invertTree(TreeNode root) {
        return traversal1(root);
    }

    public TreeNode traversal1(TreeNode node){
        if(node == null){
            return null;
        }

        traversal1(node.left);
        traversal1(node.right);

        node.left = node.right;
        node.right = node.left;

        return node;
    }

    // Q3) Maximum Depth of Binary Tree
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right)+1;
    }

    // Q4) Convert Sorted Array to Binary Search Tree
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    public TreeNode helper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = helper(nums, start, mid-1);
        node.right = helper(nums, mid+1, end);

        return node;
    }

    // Q5) Flatten Binary Tree to Linked List
    public void flatten(TreeNode root) {

    }
}
