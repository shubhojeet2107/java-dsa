public class RowColMatrix {
    public static void main(String[] args){

    }

    private static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length-1;

        while(col > 0 && row < arr.length){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }

            if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
