package patterns;

import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int row = 4;
        // int col = 4;

        for (int i=row; i>=1; i--){
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<=row-i; j++){
            System.out.print("*");
            // System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}