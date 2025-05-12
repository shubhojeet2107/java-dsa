package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutationII {
    public static void main(String[] args){
        int[] nums = {1,2,2};
        List<List<Integer>> ans = permuteUnique(nums);
        System.out.println(ans);
    }

/*
Permutation Tree for input: [1, 1, 2]

Start (sorted input): [1, 1, 2]

                   []
           ________/\________
          /       / \        \
        [1]     [1] X       [2]
       /   \      (skip)    /   \
   [1,1] [1,2]           [2,1] [2,1]
     |     |               |     |
[1,1,2] [1,2,1]       [2,1,1]  (dup)

Explanation of paths:
- [1] at index 0 is chosen → [1,1] (index 1) → [1,1,2] (index 2)
- [1] at index 0 → [1,2] (index 2) → [1,2,1] (index 1)
- [1] at index 1 directly after index 0 → SKIPPED due to duplication check
- [2] at index 2 → [2,1] (index 0) → [2,1,1] (index 1)
- [2,1] (index 1) → SKIPPED if index 1 already used

Final unique permutations generated:
→ [1,1,2]
→ [1,2,1]
→ [2,1,1]

NOTE:
Line skipped when:
if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

This avoids exploring the same value at the same level of the tree.
*/


    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backtrack(result, current, visited, nums);
        return result;
    }

    static void backtrack(List<List<Integer>> result, List<Integer> current, boolean[] visited, int[] nums){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(visited[i]) continue;

            if(i>0 && nums[i] == nums[i-1] && !visited[i-1]) continue;

            current.add(nums[i]);
            visited[i] = true;
            backtrack(result, current, visited, nums);
            visited[i] = false;
            current.remove(current.size()-1);
        }
    }
}
