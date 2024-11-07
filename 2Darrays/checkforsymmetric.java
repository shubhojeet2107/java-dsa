// Check if a 2D array is symmetric or not.

// package java_2Darrays;

import java.util.Scanner;

public class checkforsymmetric {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int cols = sc.nextInt();

        int[][] array1 = new int[rows][cols];

        // Taking Inputs
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array1[i][j] = sc.nextInt();
            }
        }

        // Taking Inputs
        boolean isymmetric = true; 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if (array1[i][j] != array1[j][i]) {
                    isymmetric = false;
                    break;
                }
                if(!isymmetric) {
                    break;
                }
            }
        }
        if (isymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
        sc.close();
    }
}