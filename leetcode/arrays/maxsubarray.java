// 53. Maximum subarray
// Brute Force.

package leetcode.arrays;

import java.util.Scanner;
public class maxsubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i=0; i<nums.length; i++){
            System.out.print("Number " +(i+1)+": ");
            nums[i] = sc.nextInt();
        }

        maxsubarray solution = new maxsubarray();
        int maxSum = solution.maxSubarray(nums);
        System.out.println(maxSum);
        sc.close();
    }

    public int maxSubarray(int[] nums){
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int currentsum = 0;
            for(int j=i; j<nums.length; j++){
                currentsum += nums[j];
                maxsum = Math.max(maxsum, currentsum);
            }
        }
        return maxsum;
    }
}