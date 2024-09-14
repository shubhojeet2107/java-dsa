// Fibonacci Series: Write a program to print the Fibonacci series up to n terms.
// 0 1 1 2 3 5 8 13....

package practice;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the Nth term for the series: ");
        int num = sc.nextInt();
        int count = 3;

        int num1 = 0;
        System.out.print(num1);
        int num2 = 1;
        System.out.print(" " +num2);
        int num3 = 1;
        System.out.print(" " +num3);

        while (num > count) {
            int sum = (num2+num3);
            System.out.print(" "+sum);

            num2 = num3;
            num3 = sum;

            count ++;
        }

        sc.close();
    }
}
