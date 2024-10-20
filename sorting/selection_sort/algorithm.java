package sorting.selection_sort;

import java.util.Arrays;

public class algorithm {
    public static void main(String[] args){
        int[] nums = {-9,-23,0,32,9};
        selection(nums);
        System.out.print(Arrays.toString(nums));
    }

    public static void selection(int[] nums){
        for(int i=0; i<nums.length; i++){
            int last = nums.length-i-1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
        }
    }

    // Method to Swap the elements;
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    // Method to get the maximum element in the array;
    public static int getMaxIndex(int[] nums, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(nums[max] <= nums[i]){
                max = i;
            }
        }
        return max;
    }
}
