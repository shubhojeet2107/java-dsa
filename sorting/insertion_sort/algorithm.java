package sorting.insertion_sort;

import java.util.Arrays;

public class algorithm {
    public static void main(String[] args){
        int[] nums = {5,3,4,1,2};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
