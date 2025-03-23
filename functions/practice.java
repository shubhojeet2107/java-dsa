package functions;

public class practice {
    
}

class Solution {

    static int findFloor(int[] arr, int k) {
        // write code here
        int start = 0;
        int end = arr.length-1;
        
        if(arr[start] > k){
            return -1;
        }
            
        while(end >= start){
            int mid = start + (end-start)/2;
            
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] > k){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}
