package functions;

import java.util.Scanner;
public class sum_of_N_natural_numbers {
    public static void main(String[] args) {
        int ans = calculatesum();
        System.out.print(ans);
    }    

    public static int calculatesum() {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter the Nth term : ");
            int num = sc.nextInt();
            int sum = 0;

            for (int i=1; i<=num; i++) {
                sum += i;
            }
            System.out.println("Sum is : " +sum);
            return calculatesum();
        }
        // return calculatesum();
    }
}
