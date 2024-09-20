// Write a program to multiply two 2D arrays.

package java_2Darrays;

import java.util.Scanner;
public class multiplicationof2matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int cols1 = sc.nextInt();

        int[][] array1 = new int[rows1][cols1];

        System.out.print("Enter the number of rows: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int cols2 = sc.nextInt();

        int[][] array2 = new int[rows2][cols2];

        // Taking input of first array:
        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols1; j++){
                array1[i][j] = sc.nextInt();
            }
        }

        // Taking input of second array:
        for(int i=0; i<rows2; i++){
            for(int j=0; j<cols2; j++){
                array2[i][j] = sc.nextInt();
            }
        }

        int result[][] = new int[rows1][cols2];

        // Output
        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols2; j++){
                for(int k=0; k<cols1; k++){
                    result[i][j] += (array1[i][k]*array2[k][j]);
                }
            }
        }
        sc.close();
    }
}