package leetcode.arrays;

public class searchinrotated {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.print(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearchsearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (nums[0] <= target) {
            return binarySearchsearch(nums, target, 0, pivot);
        } else {
            return binarySearchsearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    public static int binarySearchsearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // CASE 1:
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // CASE 2:
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // CASE 3:
            if (nums[mid] > nums[start]) {
                start = mid;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}