// Print Pattern: Write a program to print the following pattern:

// * * * *
// * * *    
// * *
// *


package patterns;

import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();

        for(int i=num; i>=1; i--){
            for(int j=1; j<=num-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
