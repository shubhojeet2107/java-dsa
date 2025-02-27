// Subsequence with recursion 

package recursion.strings;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args){
        String str = "abc";
        System.out.println(sequence("", str));
    }

    public static ArrayList<String> sequence(String empty, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(empty);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = sequence(empty+ch, str.substring(1));
        ArrayList<String> right = sequence(empty, str.substring(1));

        left.addAll(right);
        return left;
    }
}
