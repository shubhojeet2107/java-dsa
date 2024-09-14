/*Factorial of a Number: Write a program to find the factorial of a given number. 
 { N! = N*(N-1)! }  For example => 5! = (5*4*3*2*1) || (5*4!)*/


package practice;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();  
        int fact = 1;

        for (int i=num; i>=1; i--) {
            fact = (fact*i);
        }
        System.out.print("Factorial of " +num+ "! is: " +fact);
        sc.close();
    }
    
}
