// Take an array of names as input from the user and print them on the screen.

package Java_arrays;

import java.util.Scanner;
public class prob2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        String[] name = new String[size];

        // Taking Inputs
        for (int i=0; i<name.length; i++){
            System.out.print("Name " +(i+1)+ ": ");
            name[i]=sc.next();
        }

        // Show Output
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }
        sc.close();
    }
}

