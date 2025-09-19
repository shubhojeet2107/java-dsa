// https://www.geeksforgeeks.org/sum-triangle-from-array/?ref=ml_lbp
// Question from geekforgeeks.

package recursion.questions.easy;

import java.util.Arrays;

public class sumtrianglefromarray {
    public static void main(String[] args){
        int nums[] = {1, 2, 3, 4, 5};
        sum(nums);
    }

    public static void sum(int[] nums){
        
        // Base case: if only one element is left, print it
        if(nums.length < 1){
            return;
        }

        // Create a new array to store the sum of adjacent elements
        int[] ans = new int[nums.length-1];
        for(int i=0; i<nums.length-1; i++){
            ans[i] = nums[i] + nums[i+1];
        }

        // Recursive call with the smaller array
        sum(ans);

        // Print the current array
        System.out.println(Arrays.toString(nums));
    }
}
