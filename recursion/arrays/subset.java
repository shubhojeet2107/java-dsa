// Subset with iteration.

package recursion.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(subSet(arr));

        // int[] arr = {1,2,2};
        // System.out.println(subsetsWithDup(arr));
    }

    //Array with distinct values
    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); //Initialize with an empty subset
        for(int num : arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    // Array with duplicate values
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the array to bring duplicate elements together
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); //Initialize with an empty subset

        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start = 0;

            // If current element is the same as the previous element, adjust the start index
            if(i>0 && nums[i] == nums[i-1]){
                start = end+1;
            }
            end = outer.size()-1; //Mark the last index before adding new subsets
            int size = outer.size();  //Store current size of 'outer'

            for(int j=start; j<size; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j)); // Copy existing subset
                internal.add(nums[i]); // Add current element to create a new subset
                outer.add(internal);   // Add new subset to the result
            }
        }
        return outer;
    }
}
