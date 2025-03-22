// Question asked in SAP

package practice;

public class teams {
    public static void main (String[] args){
        int[] nums = {11,13,17, 24, 33, 41, 10, 22, 34};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > first){
                second = first;
                first = nums[i];
            }else{
                second = nums[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("NO Second largest");
        }else{
            System.out.println(second);
        }
    }
}
