package search.binary_search;

public class SmallestDivisor {
    public static void main(String[] args){
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.print(smallestDivisor(nums, threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = getMax(nums);

        while(start < end){
            int mid = start +(end - start)/2;
            int result = getSum(nums, mid);

            if(result >= threshold){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
        
    private static int getMax(int[] nums) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    private static int getSum(int[] nums, int divisor) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += (nums[i] + divisor - 1)/ divisor;
        }
        return sum;
    }
}