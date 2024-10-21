import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {

            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            int tab = 0;

            for (int i=1; i<=10; i++) {
                tab = num*i;
                System.out.println(tab);
            }
        }
    }
}