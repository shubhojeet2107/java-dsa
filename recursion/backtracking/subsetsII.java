package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsII {
    public static void main(String[] args){
        int[] nums = {1,2,2};
        List<List<Integer>> result = subsetsWithDup(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();


    /*
     Level 1, index 0
                    []
                  /    \
                [1]     []

    Level 2, index 1
            /     \        \
         [1,2]   [1]       [2]  <- skip second 2 if already chosen
        /    \               \
    [1,2,2]  [1,2]           [2,2]

    Level 3, index 2 (end)
    [1,2,2] [1,2]   [1]   [2,2] [2]  []

     */


    Arrays.sort(nums); 
    backtrack(0, nums, new ArrayList<>(), result);
    return result;
}

    private static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
    
        // 1️⃣ Include nums[index]
        current.add(nums[index]);
        backtrack(index + 1, nums, current, result);
        current.remove(current.size() - 1);
    
        // 2️⃣ Exclude nums[index] and skip all duplicates
        int nextIndex = index + 1;
        while (nextIndex < nums.length && nums[nextIndex] == nums[index]) {
            nextIndex++;
        }
        backtrack(nextIndex, nums, current, result);
    }
}


