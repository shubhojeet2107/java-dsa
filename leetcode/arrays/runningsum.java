package leetcode.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class runningsum {
    // Method to calculate the running sum
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];  // Correctly initialize the result array

        // Running sum calculation
        ans[0] = nums[0];  // First element remains the same
        for (int i = 1; i < size; i++) {
            ans[i] = nums[i] + ans[i - 1];  // Running sum logic
        }
        return ans;  // Return the result array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];  // Declare the nums array in the main method

        // Taking Inputs
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();  // Input array elements
        }

        // Create an instance of the Solution class and call the runningSum method
        runningsum solution = new runningsum();
        int[] ans = solution.runningSum(nums);  // Get the result

        // Output the result
        System.out.println("Running sum array: " + Arrays.toString(ans));  // Print the result

        sc.close();
    }
}
