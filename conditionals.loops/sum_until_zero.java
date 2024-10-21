// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;
public class sum_until_zero {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
        int sum = 0;

        while (true) {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("No data entered");
                break;
            }
            sum += num;
        }
        System.out.println("The sum is : " +sum);
    }
}
}