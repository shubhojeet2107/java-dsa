// Prime Number Check: Write a program to check whether a given number is a prime number.

package practice;

import java.util.Scanner;
public class primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        String str = " ";

        if (num==1) {
        System.out.println("1 is neither a prime number nor a composite number");
        }

        for (int i=2; i<num; i++) {
            if (num%i == 0){
                str = "Not prime";
                break;
            }
            else {
                str = "Prime";
            }
            // System.out.println(str);
        }
        System.out.println(str);
        sc.close();
    }
}