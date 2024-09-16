// * * * * *
// *       *
// *       *
// * * * * *

package practice;

import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = 4;
        int cols = 5;

        for (int i=1; i<=rows; i++){
            for (int j=1; j<=cols; j++){
                if (i==1 || j==1 || i==rows || j==cols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
