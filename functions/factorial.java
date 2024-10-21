package functions;

import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        checkforfactorial(sc);
        sc.close();
    }

    public static void checkforfactorial(Scanner sc){
        System.out.print("Enter the value: ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i=num; i>=1; i--){
            fact *= i;
        }
        System.out.println("Factorial: "+fact);
        checkforfactorial(sc);
    }
}