package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode17 {
    public static void main(String[] args){
        sequence("", "23");
        System.out.println();

        List<String> ans = new ArrayList<>();
        ans = letterCombinations("7");
        System.out.println(ans);
    }

    public static void sequence(String p, String digits){
        if(digits.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = digits.charAt(0) - '0'; //this will convert '2' to 2

        for (int i = (digit - 1 - 1) * 3; i < (digit-1) * 3; i++) {
            char ch = (char) ('a' + i);
            sequence(p+ch, digits.substring(1));
        }
    }

    public static ArrayList<String> sequenceList(String p, String digits){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        int digit = digits.charAt(0) - '0'; //this will convert '2' to 2

        if(digit == 7 || digit == 9){
            for(int i=(digit-2)*3; i<=(digit-1)*3; i++){
                char ch = (char) ('a' + i);
                list.addAll(sequenceList(p+ch, digits.substring(1)));
            }
        }else{
            for(int i=(digit-2)*3; i<(digit-1)*3; i++){
                char ch = (char) ('a' + i);
                list.addAll(sequenceList(p+ch, digits.substring(1)));
            }
        }

        return list;
    }

    // holds all the edge cases
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        ans = sequenceList("", digits);
        return ans;
    }

    public static ArrayList<String> sequenceList1(String p, String digits){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        int digit = digits.charAt(0) - '0'; //this will convert '2' to 2

        int i = (digit-2)*3;
        if(digit > 7){
            i+=1;
        }

        int length = i+3;
        if(digit == 7 || digit == 9) {
            length+=1;
        }

        for(; i<length; i++){
            char ch = (char) ('a' + i);
                list.addAll(sequenceList(p+ch, digits.substring(1)));
            }
            return list;
        }
    }
