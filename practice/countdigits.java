// Count Digits in a Number: Write a program to count the number of digits in a given integer.

package practice;

import java.util.Scanner;
public class countdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        String str = Long.toString(num);
        int a = 0;

        for (int i=1; i<=str.length(); i++){
            a = i;
        }
        System.out.print(a);

        sc.close();
    }
}
