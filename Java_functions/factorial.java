import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int ans = calculateFactorial();
        System.out.print(ans);
    }

    public static int calculateFactorial() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial is: " + fact);
            return calculateFactorial();
        }
    }
}
