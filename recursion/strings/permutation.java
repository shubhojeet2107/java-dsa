package recursion.strings;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args){
        String str = "abc";
        // arrangement("", str);

        ArrayList<String> ans = arrangementlist("", str);
        System.out.println(ans);
    }

    // Printing the possibilites
    public static void arrangement(String empty, String str){
        if(str.isEmpty()){
            System.out.println(empty);
            return;
        }

        char ch = str.charAt(0);

        for(int i=0; i<=empty.length(); i++){
            String first = empty.substring(0, i); // Extracts the characters till i.
            String last = empty.substring(i, empty.length()); //Extracts the remaining characters after index i.

            arrangement(first+ch+last, str.substring(1));
        }
    }

    // Storing the possibilities in an arraylist and then returning the list
    public static ArrayList<String> arrangementlist(String p, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            ans.addAll(arrangementlist(first+ch+last, str.substring(1)));
        }
        return ans;
    }
}