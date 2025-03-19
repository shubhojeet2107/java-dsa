package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode46 {
    public static void main(String[] args){
        int [] nums = {0,-1,1};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> permute(int[] nums) {
        String str = "";
        for(int i=0; i<nums.length; i++){
            str += nums[i];
        }
        ArrayList<String> ans = Solution("", str);
        
        List<List<Integer>> cont = new ArrayList<>();
        for(int i=0; i<ans.size(); i++){
            List<Integer> tempList = new ArrayList<>();
            String perm = ans.get(i);
            for(int j=0; j<perm.length(); j++){
                tempList.add(Character.getNumericValue(perm.charAt(j)));
            }
            cont.add(tempList);
        }
        return cont;
    }

    public static ArrayList<String> Solution(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());

            ans.addAll(Solution(first+ch+last, up.substring(1)));
        }
        return ans;
    }
}
