/* Print Even Numbers: Write a program to print all even numbers from 1 to 100.*/



package practice;

// import java.util.Scanner;
public class print_even {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in); 

        for (int i=1; i<=100; i++) {
            if (i%2==0)
            System.out.println(i);
        }
        // sc.close();
    }
}
