package search.binary_search;

import java.util.Scanner;
public class algorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        // Taking Inputs
        for(int i=0; i<nums.length; i++){
            System.out.print("Number " +(i+1)+ ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int ans = search(nums, target);
        System.out.print(ans);
        sc.close();
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(end >= start){
            int mid = start + (end-start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}