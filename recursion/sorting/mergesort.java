package recursion.sorting;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args){
        int[] arr = {5,1,1,2,0,0};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        } 

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] firstHalf, int[] secondHalf){
        int mix[] = new int [firstHalf.length + secondHalf.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < firstHalf.length && j < secondHalf.length){
            if(firstHalf[i] < secondHalf[j]){
                mix[k] = firstHalf[i];
                i++;
            }else{
                mix[k] = secondHalf[j];
                j++;
            }
            k++;
        }

        while(i < firstHalf.length){
            mix[k] = firstHalf[i];
            k++;
            i++;
        } 

        while(j < secondHalf.length){
            mix[k] = secondHalf[j];
            j++;
            k++;
        }

        return mix;
    }
}
