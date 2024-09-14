package practice;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operation: ");
        int xy = sc.nextInt();

        switch(xy){
            case 1: System.out.println("Addition: " +(a+b));
            break;

            case 2: System.out.println("Subtraction: " +(a-b));
            break;

            case 3: System.out.println("Multiplication: " +(a*b));
            break;

            case 4: System.out.println("Divison: " +(a/b));
            break;

            case 5: System.out.println("Remainder: " +(a%b));
            break;
        }

        sc.close();
    }
}