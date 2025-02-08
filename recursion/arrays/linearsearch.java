package recursion.arrays;

public class linearsearch {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 9};
        boolean ans = find(arr, 8, 0);
        int ans1 = findIndex(arr, 8, 0);
        System.out.println(ans);
        System.out.println(ans1);
    }

    // Returns whether the target is present or not
    static boolean find(int[] arr, int target, int index){
        if(arr[index] == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    // Returns the index value
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
}
