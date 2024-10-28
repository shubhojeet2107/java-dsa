public class checkforunique {
    public static void main(String[] args){
        int [] nums = {2, 3, 3, 4, 2, 6, 4};
        System.out.print(ans(nums));
    }

    private static int ans(int[] nums) {
        int unique = 0;

        for(int i=0; i<nums.length; i++){
            unique ^= nums[i];
        }
        return unique;
    }
}
