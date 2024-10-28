// Find the Maximun Element. Write a program to find the largest element in an array.

// package java_arrays;

import java.util.Scanner;
public class findmax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] number = new int[size];

        int max = Integer.MIN_VALUE;

        // Taking Inputs
        for(int i=0; i<number.length; i++){
            System.out.print("Number " +(i+1)+ ": ");
            number[i] = sc.nextInt();
        }

        // Output
        for(int i=0; i<number.length; i++){
            if(max < number[i]){
                max = number[i];
            }
        }
        System.out.print("Largest number in the list is: " +max);
        sc.close();
    }
}