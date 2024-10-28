// Find the maximum & minimum number in an array of integers. 

// package java_arrays;

import java.util.Scanner;
public class prob3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // Taking inputs
        for(int i=0; i<numbers.length; i++){
            System.out.print("Number "+(i+1)+": ");
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // OUTPUT
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < min) {
                min = numbers[i];
            }

            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum value: " +max);
        System.out.println("Minimum value: " +min);
        sc.close();
    }
}
