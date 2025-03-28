package leetcode;

public class leetcode52 {
    public static void main(String[] args){
        System.out.println(totalNQueens(4));
    }

    public static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        int ans = placing(board, 0);
        return ans;
    }

    public static int placing(boolean[][] board, int row){
        if(row == board.length){
            return 1;
        }

        int count = 0;

        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += placing(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        //for vertical row
        for(int i = 0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        //for diagonal left
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]){ //we are decreasing the row and col by i so that it checks till the [i]th block of board diagonally
                return false;
            }
        }

        //for diagonal right
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]){ //we are decreasing the row and col by i so that it checks till the [i]th block of board diagonally
                return false;
            }
        }
        return true;
    }
}
