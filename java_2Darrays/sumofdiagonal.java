// Find the sum of the diagonal elements of a square 2D array.

package java_2Darrays;

import java.util.Scanner;
public class sumofdiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];
        int sum = 0;

        // Taking Inputs
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j] = sc.nextInt();
            }
        }

        sum = (array[0][0]+array[1][1]);
        System.out.println("Sum: " +sum);
        sc.close();
    }
}
