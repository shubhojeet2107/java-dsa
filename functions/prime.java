import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int ans = calculateprime();
        System.out.print(ans);
    }

    public static int calculateprime() {
        try (Scanner sc = new Scanner(System.in)) {
            String result = " " ;

            System.out.print("Enter the number to check for prime : ");
            int num = sc.nextInt();

            if (num==1) 
            System.out.println("1 is neither prime nor composite");

            for (int i=2; i<num; i++) {
                if (num%i == 0) {
                    result = "Not prime";
                    break;
                }
                else {
                    result = "Prime";
                }
            }
            System.out.println(result);
            return calculateprime();
        }
    }
}
