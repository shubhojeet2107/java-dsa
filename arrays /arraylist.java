// Trying out Arraylist.

import java.util.Scanner;
// import java.util.Arrays;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<5; i++){
            System.out.print("Number " +(i+1)+ ": ");
            list.add(sc.nextInt());
            // list.get(2);
        }
        System.out.println(list);
        // list.get(2);
        // list.size();
        System.out.print(list.size());
        sc.close();
    }
}