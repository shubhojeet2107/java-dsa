// https://www.geeksforgeeks.org/problems/geek-onacci-number/0

package recursion.questions.easy;

import java.util.Scanner;

public class Geek_onacciNum {
    public static void main (String[] args) {
        //code here
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        for(int i=0; i<test_cases; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();

            int result = recursive(4, A, B, C, N);
            System.out.println(result);
        }
    }

    public static int recursive(int index, int n1, int n2, int n3, int n){
        if(n == index){
            return n1+n2+n3;
        }
        int temp = n1+n2+n3;
        return recursive(index+1, n2, n3, temp, n);
    }
}
