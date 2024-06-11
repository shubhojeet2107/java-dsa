import java.util.Scanner;
public class sum_of_N_numbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //Taking input from the user
            System.out.print("Enter the Nth term : ");
            int num = sc.nextInt();

            //Initializing the value of sum
            int sum = 0;

            //Using loops to iterate the terms
            for (int i=1; i<=num; i++) {
//            sum += num;
                sum += i;
            }
            System.out.print("The sum is : " +sum);
        }
    }
}