package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode2594 {
    public static void main(String[] args){
        int[] ranks = {4,2,3,1};
        int cars = 10;
        System.out.println(repairCars(ranks, cars));
    }

    public static long repairCars(int[] ranks, int cars) {
        int ans = helper(ranks, cars);
        return ans;
    }

    public static int helper(int[] arr, int cars){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end - start)/2;
        ArrayList<Integer> ans = mechanic(arr, cars, arr[mid], end);

        int[] list = ans.stream().mapToInt(i -> i).toArray();

        int num = search(list, ans.get(ans.size()-1), 0, list.length-1);
        return num;
    }

    public static ArrayList<Integer> mechanic(int[] arr, int cars, int mid, int index){
        if(index == 0){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[index]*cars*cars);
            return list;
        }

        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[index]*mid*mid);

        ArrayList<Integer> ansfrombelow = mechanic(arr, cars-mid, mid, index-1);

        list.addAll(ansfrombelow);

        return list;
    }

    public static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return arr[mid];
        }
        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
