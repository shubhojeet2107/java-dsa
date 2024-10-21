import java.util.Scanner;

public class sum_until_zero_fn {
    public static void main(String[] args) {
        int ans = calculatesum();
        System.out.print(ans);
    }

    public static int calculatesum() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter numbers to add up until the user inputs zero");
            int sum = 0;
            int num = 0;

            do {
                System.out.print("Enter the number : ");
                num = sc.nextInt();

                if (num == 0) {
                    System.out.println("WHOOPS!");
                    break;
                }
                sum += num;
            } while (num != 0);
            System.out.println("The sum is : " + sum);
            return calculatesum();
        }
    }
}