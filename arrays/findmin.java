// Find the Minimum Element. Write a program to find the smallest element in an array.

package java_arrays;

import java.util.Scanner;
public class findmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        // Taking Input from the user
        for(int i=0; i<nums.length; i++){
            System.out.print("Number " +(i+1)+ ": ");
            nums[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        // Output
        for(int i=0; i<nums.length; i++){
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.print("Smallest Element: " +min);
        sc.close();
    }
}
