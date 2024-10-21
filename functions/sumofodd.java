// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;
public class sumofodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        calculatesumofodd(sc);
        sc.close();
    }

    public static void calculatesumofodd(Scanner sc){
        System.out.print("Enter the limit: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            if (i%2 != 0){
                sum += i;
            }
        }
        System.out.println("The sum is: "+sum);
        calculatesumofodd(sc);
    }
}
