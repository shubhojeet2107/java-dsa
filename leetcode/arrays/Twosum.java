package leetcode.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] nums = new int[size];

            // Taking Input
            for (int i = 0; i < nums.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                nums[i] = sc.nextInt();
            }

            System.out.print("Enter the target: ");
            int target = sc.nextInt();

            Twosum solution = new Twosum();
            int[] ans = solution.twoSum(nums, target);

            System.out.println(Arrays.toString(ans));
        }
    }

    public int[] twoSum(int[] nums, int target) {
        // int size = nums.length;
        // int[] ans = new int[size];
    
        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j>i; j--){
                if(nums[i]+ nums[j] == target){
                    // ans[i] = {nums[i], nums[j]};
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}