package recursion.basics;

public class practice {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 9};
        int min = findmin(arr);
        int max = findmax(arr);
        System.out.println(min);
        System.out.println(max);
    }

    static int findmin(int[] nums){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    static int findmax(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
