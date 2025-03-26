package leetcode;

public class practice {
    public static void main(String[] args){

    }

    public int splitArray(int[] nums, int k) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i=0; i<=nums.length; i++){
            end += nums[i];
            start = Math.max(start, nums[i]);
        }

        while(start < end){
            int mid = start+(end - start)/2;
            int sum = 0;
            int count = 1;

            for(int i=0; i<nums.length; i++){
                if(sum+nums[i] > mid){
                    count += 1;
                    sum = nums[i];
                }else{
                    sum += nums[i];
                }
            }

            if(count <= k){ // mid is a potential answer
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
