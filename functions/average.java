package functions;

// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;
public class average {
    public static void main(String[] args){
        // int ans = 
        Scanner sc = new Scanner(System.in);
        calculateaverage(sc);
        sc.close();
        // System.out.print(ans);
    }

    public static void calculateaverage(Scanner sc) {
        // Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Number 3: ");
        int num3 = sc.nextInt();
        int avg = 0;

        avg = (num1+num2+num3)/3;
        System.out.println("Average of the three is: " +avg);
        // sc.close();
        calculateaverage(sc);
    }
}
