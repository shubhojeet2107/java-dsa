// Multiplication Table: Write a program to print the multiplication table of a given number.


package practice;

import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner reads = new Scanner (System.in);

        System.out.print("Enter the Number: ");
        int num = reads.nextInt();
        int multiplication = num;

        for (int i=1; i<=10; i++) {
            multiplication = (num*i); 
            System.out.println(num+" * " +i+ "  =  "+multiplication);
        }
        // System.out.println(multiplication);
        reads.close();
    }
}
