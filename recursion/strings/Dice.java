package recursion.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args){
        function("", 4);

        ArrayList<String> ans = new ArrayList<>();
        ans = dice("", 4);
        System.out.println(ans);
    }

    // printing out the possibilities
    public static void function(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        
        for(int i=1; i<=target; i++){
            function(p+i, target-i);
        }
    }

    // storing the data in an ArrayList and returning the list
    public static ArrayList<String> dice(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i=1; i<=target; i++){
            ans.addAll(dice(p+i, target-i));
        }

        return ans;
    }
}
