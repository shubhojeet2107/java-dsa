package leetcode;

public class leetcode494 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int ans = findTargetSumWays(nums, 3);
        System.out.println(ans);
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int ans = backtrack(0, 0, nums, target);
        return ans;
    }

    static int backtrack(int ans, int i, int[] nums, int target){
        if(i == nums.length){
            return ans == target ? 1:0;
        }

        int pos = backtrack(ans+nums[i], i+1,  nums, target);
        int neg = backtrack(ans-nums[i], i+1, nums, target);

        return neg+pos;
    }
}
