package leetcode.arrays;

import java.util.Scanner;
import java.util.Arrays;
public class plusone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] digits = new int[size];

        // Taking Inputs
        for(int i=0; i<digits.length; i++){
            System.out.print("Number " +(i+1)+ ": ");
            digits[i] = sc.nextInt();
        }

        plusone solution = new plusone();
        int[] ans = solution.plusOne(digits);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }


    public int[] plusOne(int[] digits){
        int size = digits.length;

        // Traverse the array from the last element to handle carry
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment if digit is less than 9
                return digits; // Return result immediately if no carry
            }
            digits[i] = 0; // Set digit to 0 if it was 9 (carry over)
        }

        // If all digits were 9, we need an additional digit
        int[] ans = new int[size + 1];
        ans[0] = 1; // The first digit will be 1, rest will be 0 by default
        return ans;
    }
}
