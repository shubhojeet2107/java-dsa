// Take an array as input from user. Search for given number X and print the index at which it occurs.

// package java_arrays;

import java.util.Scanner;
public class prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] number = new int[size];

        // Taking inputs
        for(int i=0; i<size; i++) {
            System.out.print("Number " +(i+1)+ ": ");
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int x = sc.nextInt();

        // Output 
        for(int i=0; i<size; i++){
            if (number[i] == x){
                System.out.println("The index value at which the number is at: " +i);
            }
        }
        sc.close();
    }
}
