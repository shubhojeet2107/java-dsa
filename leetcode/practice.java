package leetcode;

import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args){

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    public static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums){
        if(templist.size() == nums.length){
            list.add(new ArrayList<>(templist));
            return;
        }else{
            for(int i=0; i<nums.length; i++){
                if(templist.contains(nums[i])){
                    continue;
                }
                templist.add(nums[i]);
                backtrack(list, templist, nums);
                templist.remove(templist.size()-1);
            }
        }
    }
}