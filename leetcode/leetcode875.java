package leetcode;

public class leetcode875 {
    public static void main(String[] args) {
        int[] nums = {3,6,7,11};
        System.out.println(minEatingSpeed(nums, 8));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = piles[0];
        
        for(int i=0; i<piles.length; i++){
            start = Math.min(start, piles[i]);
            end = Math.max(end, piles[i]);
        }

        while(start < end){
            // Mid is the K which we are assuming.
            int mid = start+(end-start)/2; 

            int hours = 0;
            for(int i=0; i<piles.length; i++){
                hours += (piles[i] + mid - 1) / mid;
            }

            if(hours <= h){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
