package recursion.arrays;

public class RBS {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr, 0, 0, arr.length-1);
        System.out.print(ans);
    }

    public static int search(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(target <= arr[mid] && target >= arr[start]){
                return search(arr, target, start, mid-1);
            }else{
                return search(arr, target, mid+1, end);
            }
        }

        if(target >= arr[mid] && arr[end] >= target){
            return search(arr, target, mid+1, end);
        }
        return search(arr, target, start, mid-1);
    }
}
