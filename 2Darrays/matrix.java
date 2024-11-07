// Taking a matrix as an input and printing its elements.

// package java_2Darrays;

import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input arrays
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output arrays
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
