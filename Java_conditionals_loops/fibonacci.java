import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Nth term : ");
            int num = sc.nextInt();
            int a = 0;
            int b = 1;
            int count = 3;
            int temp = 0;

            if (num == 1 || num == 0) {
                System.out.print(0);
                
            }else {
                while (count <= num) {
                    temp = b; // we are storing value of b(1) in temp whose value is (0)
                    b = b + a; // now when b is empty(0) we are storing the sum of a(0) and b(1) which will be
                               // (1)
                    a = temp; // in this we are increasing the value of a(0) before to (1) now
                    count++; // as we increase the count we can form the Nth value of fibonacci series.
                    System.out.print(" "+b);
                }
                // System.out.print(b);
            }
        }
    }
}