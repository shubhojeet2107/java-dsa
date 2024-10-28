// Sum of all elements in an array.

// package java_arrays;

import java.util.Scanner;
public class sumofelements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Declaring the size of an array.
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int sum = 0;

        // Taking input
        for(int i=0; i<numbers.length; i++){
            System.out.print("Number " +(i+1)+ ": ");
            numbers[i] = sc.nextInt();
        }

        // Output
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i]; 
        }
        System.out.print("The sum of all the elements is: " +sum);
        sc.close();
    }
}
