// Taking an array as an input and printing its elements.

package java_arrays;

import java.util.Scanner;
public class printnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Taking inputs
        for(int i=0; i<numbers.length; i++){
            System.out.print("Number "+(i+1)+ ": ");
            numbers[i] = sc.nextInt();
        }

        // OUTPUT
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
