package sorting.cyclic_sort;

import java.util.Arrays;

public class algorithm {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        cycle(nums);
        System.out.print(Arrays.toString(nums));
    }

    static void cycle(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = (nums[i]);
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
