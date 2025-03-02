// Subsequence with recursion 

package recursion.strings;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args){
        String str = "abc";
        System.out.println(sequence("", str));
        subSequence("", str);
    }

    // Returning an ArrayList
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

    // Returning no data type
    public static void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSequence(p+ch, up.substring(1));
        subSequence(p, up.substring(1));
    }
}
