package trees;

public class BinarySearchTree {

    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    public BinarySearchTree(){

    }

    private Node root;

    public boolean isEmpty(){
        return root == null;
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    // Inserting an element.
    public void insert(int value){
        root = insert(root, value);
    }

    public Node insert(Node node, int value){
        if(node == null){ // empty space is found.
            node = new Node(value); // create a new node.
            return node; // return the node
        }

        // Check if we can place the Node in left side which should be less than the current Node. (value < Node)
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        // Check if we can place the Node in right side which should be greater than the current Node. (value > Node)
        if(value > node.value){
            node.right = insert(node.right, value);
        }

        // Storing the height at every level.
        node.height = Math.max(height(node.left), height(node.right));
        return node; // Return the Main Node after adding up the left and right nodes.
    }
    // This function takes an array of integers as input (nums[])
    // It loops through each element of that array.
    // For each value, it calls the insert() method on the current object (this.insert(nums[i]))
    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }

    // Populating the elements from a sorted Array.
    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    public void populateSorted(int[] nums, int start, int end){
        if (start >= end){
            return;
        }
        int mid = start+(end-start)/2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

    // This function checks recursively if the entire binary tree is height-balanced.
    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
}
