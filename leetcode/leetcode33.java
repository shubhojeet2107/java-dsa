package leetcode;

public class leetcode33 {
    public static void main(String[] args){
        int[] nums = {3,1};
        System.out.println(search(nums, 3));
    }

    public static int search(int[] nums, int target) {
        int pivot = Pivot(nums);
        int start = 0;
        int end = nums.length-1;

        if (pivot == -1) {
            return BS(nums, target, start, end);
        }
        if(target >= nums[start]){
            return BS(nums, target, start, pivot);
        }else{
            return BS(nums, target, pivot+1, end);
        }
    }

    // function to find the pivot.
    static int Pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start+(end-start)/2;

            //case 1:
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            //case 2:
            if(mid > start && nums[mid-1] > nums[mid]){
                return mid-1;
            }
            //case 3:
            if(nums[mid] > nums[start]){
                start = mid;
            }else if(nums[mid] < nums[end]){
                end = mid-1;
            }
        }
        return -1;
    }

    // function to search the target.
    static int BS(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
