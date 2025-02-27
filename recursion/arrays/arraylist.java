package recursion.arrays;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        int[] arr = {3, 4, 7, 12, 5, 7, 24};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = search(arr, 7, 0, list);
        System.out.println(ans);

        ArrayList<Integer> ans2 = search(arr, 7, 0);
        System.out.println(ans2);
    }

    // Passing list in the parameters
    public static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return search(arr, target, index+1, list);
    } 

    // Creating the list inside the function block. With each recursive call, it will create a new list and I will use "addAll" function to sum all the answers in the list.
    public static ArrayList<Integer> search(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == target){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansfrombelowcalls = search(arr, target, index+1);

        list.addAll(ansfrombelowcalls);
        return list;
    } 
}
