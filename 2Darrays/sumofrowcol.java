// Calculate the sum of each row and column in a 2D array.

package java_2Darrays;

import java.util.Scanner;
public class sumofrowcol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];
        int sumofrows = 0;
        int sumofcols = 0;

        // Taking Inputs
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j] = sc.nextInt();
            }
        }

        sumofrows = (array[0][0]+array[0][1]);
        sumofcols = (array[1][0]+array[1][1]);

        System.out.println("Sum of rows: " +sumofrows);
        System.out.println("Sum of coloumns: " +sumofcols);
        sc.close();
    } 
}
