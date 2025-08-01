package trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ImplementBT tree = new ImplementBT();
        tree.setRoot(sc);
//        tree.display();
        tree.prettyDisplay();
    }
}
