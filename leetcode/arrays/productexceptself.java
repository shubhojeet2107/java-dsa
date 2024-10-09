// Product of Array Except Self

package leetcode.arrays;

import java.util.Scanner;
import java.util.Arrays;
public class productexceptself {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] product = new int[size];

        // Taking Inputs
        for(int i=0; i<nums.length; i++){
            System.out.print("Number " +(i+1)+ ": ");
            nums[i] = sc.nextInt();
        }

        // Output
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] != nums[j]){
                    product[i] = (nums[i]*nums[j]);
                    // System.out.print(Arrays.toString(product));
                }
                System.out.print(Arrays.toString(product));
            }
        }
        System.out.print(Arrays.toString(product));
        sc.close();
    }
}
