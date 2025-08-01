package trees;

import java.util.Scanner;

public class ImplementBT {

    public ImplementBT(){
    }

    private static class Node{
        private int value;
        private Node left;
        private Node right;

        private Node(int value){
            this.value = value;
        }
    }

    // insert elements
    // Creation of Root Node.
    public Node root;
    public void setRoot(Scanner sc){
        System.out.print("Enter the Root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    // Creation of left Node and Right Node.
    public void populate(Scanner sc, Node node){
        System.out.print("Do you want to enter left of " +node.value +": ");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the value of left of " +node.value +": ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.print("Do you want to enter the right of " +node.value +": ");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter the value of right of " +node.value +": ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    // Displaying the Tree:
    public void display(){
        display(this.root, "");
    }
    public void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    // Pretty Display:
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }


    // pre_order
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // in_order
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // post_order
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}