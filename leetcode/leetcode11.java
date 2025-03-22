package leetcode;

public class leetcode11 {
    public static void main(String[] args){
        int[] heights = {1,2,1};
        int ans = maxArea(heights);
        System.out.println(ans);
    }

    public static int maxArea(int[] height) { 
        int start = 0;
        int end = height.length-1;

        int max = Integer.MIN_VALUE;

        while(start < end){
            int length = end-start;

            if(height[end] == height[start]){
                int ans = (length*height[end]);
                max = Math.max(max, ans);
                end -= 1;
                start += 1;
            }
            else if(height[start] > height[end]){
                int ans = (length*height[end]);
                max = Math.max(max, ans);
                end -= 1;
            }else{
                int ans = (length*height[start]);
                max = Math.max(max, ans);
                start += 1;
            }
        }
        return max;
    }
}
