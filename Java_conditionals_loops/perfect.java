import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i=1; i<num; i++) {
            if (num%i == 0) {
                System.out.println(" " +i);
                sum = sum + i;
            }
        }
        System.out.println("The sum is : " +sum);

        if (sum == num) {
            System.out.print("It is a perfect number");
        }
        else {
            System.out.print("Whoops");
        }
    }
}
