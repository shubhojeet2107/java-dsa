package recursion.backtracting;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        /*
                                           []
                                      /          \
        level 1, for index 0         1             []
                                  /     \         /    \
        level 2, for index 1    12       1      2       []
                               /  \     / \    /  \     / \
        level 3, for index 2  123  12  13  1  23   2   3   []
        */
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        findAllSubsets(nums, 0, ans, result);
        return result;
    }

    private void findAllSubsets(int[] nums, int index, List<Integer> ans, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        // case 1: add this nums[index];
        ans.add(nums[index]);
        findAllSubsets(nums, index + 1, ans, result);
        ans.remove(ans.size() - 1);

        // case 2: do not add this nums[index];
        findAllSubsets(nums, index + 1, ans, result);
    }
}
// Time: O(n * 2^n)
// Space: O(n)