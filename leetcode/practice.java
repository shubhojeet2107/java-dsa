package leetcode;

public class practice {
    public static void main(String[] args){
        int[] nums = {7,2,5,10,8};
        System.out.println(splitArray(nums, 2));
    }

    public static int splitArray(int[] nums, int k){
        int max = 0;
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            end += nums[i];
        }
        start = max;

        while(start < end){
            int mid = start+(end-start)/2;

            int count = 1;
            int sum = 0;

            for(int i=0; i<nums.length; i++){
                if(mid >= sum+nums[i]){
                    sum = sum+nums[i];
                }else{
                    sum = nums[i];
                    count++;
                }
            }

            if(count <= k){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return end;
    }
}