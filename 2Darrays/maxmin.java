// Write a program to find the largest and smallest elements in a 2D array.

package java_2Darrays;

import java.util.Scanner;
public class maxmin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // Taking Input 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Output 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if (array[i][j] < min){
                    min = array[i][j];
                }
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Minimum: " +min);
        System.out.println("Maximum: "+max);
        sc.close();
    }
}