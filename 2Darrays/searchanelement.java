// Searching for an element x in a matrix.

// package java_2Darrays;

import java.util.Scanner;

public class searchanelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Taking Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the (" + (i + 1) + (j + 1) + ")th element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to search for: ");
        int num = sc.nextInt();
        boolean found = false;

        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == num) {
                    found = true;
                    break;
                }
                if (found) {
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        sc.close();
    }
}