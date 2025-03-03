package leetcode;

import java.util.ArrayList;

public class leetcode390 {
        public static void main(String[] args){
            int ans = lastRemaining(1000);
            System.out.println(ans);
        }
    
        public static int lastRemaining(int n) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1; i<=n; i++){
                list.add(i);            
            }
            return last(list, 0);
        }
    
        public static int last(ArrayList<Integer> list, int count){
            if(list.size() == 1){
                return list.get(0);
            }

        if(count%2==0){
            for(int i = 0; i < list.size(); i++){
                list.remove(i);
            }
            return last(list, count+1);
        }
        for(int i=list.size()-1; i>=0; i-=2){
            list.remove(i);
        }
        return last(list, count+1);
    }
}
  