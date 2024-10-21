// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkifeligible(sc);
        sc.close();
    }

    public static void checkifeligible(Scanner sc) {
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age>18) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
        checkifeligible(sc);
    }
}
