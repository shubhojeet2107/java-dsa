package sorting.bubble_sort;

import java.util.Arrays;
public class algorithm {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        bubble(nums);
        System.out.print(Arrays.toString(nums));
    }

    public static void bubble(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
