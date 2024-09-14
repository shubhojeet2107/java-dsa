// Reverse a Number: Write a program to reverse a given integer number.

package practice;

import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number:");
        int num = sc.nextInt();
        String str = Integer.toString(num);

        for (int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
