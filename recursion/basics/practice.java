package recursion.basics;

public class practice {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 9};
        boolean ans = helper(arr, 0);
        System.out.println(ans);
    }

    static boolean helper(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && helper(arr, index+1);
    }
}