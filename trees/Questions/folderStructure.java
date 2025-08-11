package trees.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class folderStructure {
    public class Node{
        private int val;
        private Node right;
        private Node left;

        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        folderStructure fs = new folderStructure();
        Node root = fs.new Node(0);
        fs.folder(root, sc);
    }

    public void folder(Node node, Scanner sc){
//        if(node.val == 10){
//            System.out.println("The End of Folder Structure");
//            return;
//        }

        while(true){
            System.out.print("you are in folder ' " +node.val+ " ' either enter 1 to go inside the folder or 0 to go back: ");
            int num = sc.nextInt();

            if(num == 0){
                System.out.println("you are returning back from folder number: " +node.val);
                return;
            }else{
                System.out.println("creating a subfolder of: "+node.val);
                node.right = new Node(node.val+1);
                folder(node.right, sc);
            }
        }
    }

    public boolean isSameTree(Node p, Node q){
        if(p == null && q == null){
            return true;
        }

        if(p.val != q.val){
            return false;
        }
        boolean leftTree = isSameTree(p.left, q.left);
        boolean rightTree = isSameTree(p.right, q.right);

        return leftTree && rightTree;
    }
}