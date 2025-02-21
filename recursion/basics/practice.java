package recursion.basics;

import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        pattern(num, 1, 1);
        sc.close();
    }

    public static void pattern(int n, int i, int j){
        if(n < i){
            return;
        }
        for(j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
        pattern(n, i+1, j);
    }
}

