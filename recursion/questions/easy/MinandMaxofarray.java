// https://www.geeksforgeeks.org/dsa/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

package recursion.questions.easy;

public class MinandMaxofarray {
    public static void main(String[] args){
        int[] nums = {1,4,3,-5,-4,8,6};

        int [] arr = recursive(nums, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.println("min " + arr[0]);
        System.out.println("max " + arr[1]);
    }

    public static int[] recursive(int[] nums, int index, int min, int max){
        if(nums.length == index){
            return new int[]{min, max};
        }

        if(nums[index] > max){
            max = nums[index];
        }
        if(nums[index] < min){
            min = nums[index];
        }

        return recursive(nums, index+1, min, max);
    }
}
