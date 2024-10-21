import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter the number as input and print the multiplication table for it. : ");
            int num = sc.nextInt();
            int y = 0;

            for (int i=1; i<=10; i++) {
                y = num*i;
                System.out.println(+num+ "x" +i+ "=" +y);
            }
        }
    }
}