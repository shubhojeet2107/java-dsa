// Find the sum of the diagonal elements of a square 2D array.

package leetcode.arrays;

import java.util.Scanner;

public class sumofdiagonal {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += mat[i][i];

            // Add secondary diagonal element, avoid double counting of center element
            if (i != n - i - 1) {
                sum += mat[i][n - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of coloumns: ");
            int cols = sc.nextInt();
            int[][] mat = new int[rows][cols];

            // Taking Inputs
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            System.out.println("Diagonal sum: " + diagonalSum(mat));
        }
    }
}
