package leetcode;

import java.util.Arrays;

public class aggressivecows {
    public static void main(String[] args){

    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[stalls.length-1] - stalls[0];

        while(start <= end){
            int mid = start+(end-start)/2;

            if(canWePlaceCows(stalls, mid, k)){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }

    public static boolean canWePlaceCows(int[] nums, int distance, int cows){
        int last = nums[0];
        int cntCows = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] - last >= distance){
                cntCows++;
                last = nums[i];
            }
            if(cntCows >= cows){
                return true;
            }
        }
        return false;
    }
}
