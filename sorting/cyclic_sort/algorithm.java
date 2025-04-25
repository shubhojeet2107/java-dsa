package sorting.cyclic_sort;

import java.util.Arrays;

public class algorithm {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        cycle(nums);
        System.out.print(Arrays.toString(nums));
    }

    static void cycle(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = (nums[i]-1); //we subtract -1 only if the numbers in the array is from 1 to n. if the numbers are from 0 to n then there is no need for subtracting -1.
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    // Method to Swap the elements;
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
