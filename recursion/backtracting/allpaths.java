package recursion.backtracting;

import java.util.Arrays;

public class allpaths {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        int[][] path = new int[board.length][board[0].length];
        problem2("", board, 0, 0, path, 0);
    }

    public static void problem1(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        // i am considering this block in my path
        maze[row][col] = false;

        if (row < maze.length - 1) {
            problem1(p + 'D', maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            problem1(p + 'R', maze, row, col + 1);
        }
        if (row > 0) {
            problem1(p + 'U', maze, row - 1, col);
        }
        if (col > 0) {
            problem1(p + 'L', maze, row, col - 1);
        }

        // this line is where the function will be over so before the function gets
        // removed, also remove the changes that were made by that function
        maze[row][col] = true;
    }

    public static void problem2(String p, boolean[][] maze, int row, int col, int[][] path, int step){
        if(row == maze.length-1 && col == maze[0].length-1){
            path[row][col] = step; //For the last step.
            for(int i=0; i<path.length; i++){
                int[] arr = path[i];
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p); 
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        // i am considering this block in my path
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            problem2(p + 'D', maze, row + 1, col, path, step+1);
        }
        if (col < maze[0].length - 1) {
            problem2(p + 'R', maze, row, col + 1, path, step+1);
        }
        if (row > 0) {
            problem2(p + 'U', maze, row - 1, col, path, step+1);
        }
        if (col > 0) {
            problem2(p + 'L', maze, row, col - 1, path, step+1);
        }

        // this line is where the function will be over so before the function gets
        // removed, also remove the changes that were made by that function
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
