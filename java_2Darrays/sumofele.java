// Find the sum of all elements in a 2D array.

package java_2Darrays;

import java.util.Scanner;
public class sumofele {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // Taking Input
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++){
                System.out.print("Enter the (" + (i + 1) + (j + 1) + ")th element: ");
                array[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum += array[i][j];
            }
        }
        System.out.println("Sum: " +sum);
        sc.close();
    }
}
