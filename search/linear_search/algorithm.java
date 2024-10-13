package search.linear_search;

public class algorithm {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int target = 0;
        int result = linear(nums, target);
        System.out.print(result);
    }

    public static int linear(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
