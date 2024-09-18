// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;
public class greaterthan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculategreaterthan(sc);
        sc.close();
    }

    public static void calculategreaterthan(Scanner sc) {
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1+" is greater");
        }
        else {
            System.out.println(num2+" is greater");
        }
        calculategreaterthan(sc);
    }
}
