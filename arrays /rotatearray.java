
public class rotatearray {
    public static void main(String[] args){

    }

    public int[] rotate(int[] nums, int k) {
        int end = nums.length;
        for(int i=0; i<nums.length-k; i++){
            return new int[] {nums[end] + nums[i]};
        }
        end--;
        return null;
    }
}
