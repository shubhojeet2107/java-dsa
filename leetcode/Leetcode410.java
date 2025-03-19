package leetcode;

public class Leetcode410 {
    public static void main(String[] args){
        int[] nums = {7,2,5,10,8};
        int ans = splitArray(nums, 2);
        System.out.println(ans); 
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start = Math.max(start, nums[i]); //This will carry the max element present in the array.
            end += nums[i]; //This will hold the sum of all elements present in array.
        }

        while (start < end){
            int mid = start+(end -start)/2;

            int sum = 0;
            int count = 1; //At least one subarray will be formed
            for(int i=0; i<nums.length; i++){
                if(sum+nums[i] > mid){
                    sum = nums[i];
                    count ++;
                }else{
                    sum += nums[i];
                }
            }

            if(k >= count){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
