// Write a program to transpose a 2D array.

package java_2Darrays;

import java.util.Scanner;
public class transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // Taking Inputs
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(array[j][i]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}