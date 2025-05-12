package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public static void main(String[] args){

    }

    static void backtrack(int index, List<List<Integer>> result, List<Integer> current, int[] candidates, int target){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i=index; i<candidates.length; i++){
            current.add(candidates[i]);
            backtrack(i, result, current, candidates, target-candidates[i]);
            current.remove(current.size()-1);
        }
    }
}
