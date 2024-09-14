// Palindrome Check: Write a program to check if a given number or string is a palindrome.

package practice;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number or string: ");
        String str = sc.nextLine();
        String a = "";
        String b = "";

        for (int i=0; i<str.length(); i++){
            // System.out.print(str.charAt(i)+" ");
            char right = str.charAt(i);
            a = (a+right);
        }
        System.out.println(a);

        // System.out.println(" ");

        for (int j=str.length()-1; j>=0; j--){
            // System.out.print(str.charAt(j)+" ");
            char left = str.charAt(j);
            b = (b+left);
        }
        System.out.println(b);

        if (a.equals(b)) 
            System.out.println("Palindrome");
        else 
            System.out.print("Not Palindrome");

        sc.close();
    }
}