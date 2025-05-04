package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    /*
                              []
               _________/ | \_________
              /           |           \
            [a]          [b]          [c]
           /   \        /   \        /   \
        [a,b] [a,c]  [b,a] [b,c]  [c,a] [c,b]
         |      |      |     |      |     |
     [a,b,c] [a,c,b] [b,a,c][b,c,a][c,a,b][c,b,a]

    Legend:
    - []: root (empty permutation)
    - Each edge represents adding a new character (a, b, or c)
    - Each path from root to leaf is a full permutation of [a, b, c]

     */
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
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
            if(visited[i]){
                continue;
            }
            current.add(nums[i]);
            visited[i] = true;
            backtrack(result, current, visited, nums);
            
            visited[i] = false;
            current.remove(current.size()-1);
        }
    }
}
