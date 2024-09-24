package leetcode.arrays;

import java.util.Scanner;
import java.util.Arrays; // Importing Arrays for proper array printing

public class permutation {

    // Static method to build the array as per the problem statement
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; // Initialize the array with the correct size

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]]; // Properly accessing nums[nums[i]]
        }
        return ans; // Return the whole array
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt(); // Read the size of the array

            int[] nums = new int[size]; // Declare nums array here, before the try block

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt(); // Read array elements from the user
            }

            // Call buildArray and print the result
            int[] result = buildArray(nums);
            System.out.println("Resulting array: " + Arrays.toString(result)); // Proper way to print an array
        }
    }
}
