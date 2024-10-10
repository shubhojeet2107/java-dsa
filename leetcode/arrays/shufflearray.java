// 1470. Shuffle the Array

package leetcode.arrays;

import java.util.Scanner;
// import java.util.Arrays;
public class shufflearray {
    // public int[] shuffle(int[] nums, int n) {
    //     return ans;
    // }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc .nextInt();
        int[] nums = new int[size];

        System.out.print("Enter the n: ");
        // int n = sc.nextInt();

        // Taking Inputs
        for(int i=0; i<nums.length; i++){
            System.out.print("Numbers: " +(i+1)+ ": ");
            nums[i] = sc.nextInt();
        }
        sc.close();
    }
}