// This contains implementations of various maze-related problems

package recursion.backtracting;

public class maze {
    public static void main(String[] args){
        // System.out.println(problem1(3, 3));
        // System.out.println();
        // problem2("", 3, 3);
        // System.out.println();
        // problem3("", 3, 3);

        boolean[][] game = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };
        problem4("", game, 0, 0);
    }

    // Problem 1: Count the number of ways to reach the bottom-right corner from the top-left corner in a grid, moving only right or down.
    public static int problem1(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = problem1(row, col-1);
        int right = problem1(row-1, col);

        return left+right;
    }

    //Problem 2: Print the number of ways to reach the bottom-right corner from the top-left corner in a grid, moving only right or down.
    public static void problem2(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1){
            problem2(p+'D', row-1, col);
        }

        if(col > 1){
            problem2(p+'R', row, col-1);
        }
    }

    //Problem 3: Print all possible paths to reach the bottom-right corner from the top-left corner in a grid, moving right ('R'), down ('D'), or diagonally ('d').
    public static void problem3(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        if(row > 1){
            problem3(p+'D', row-1, col);
        }

        if(row > 1 && col > 1){
            problem3(p+'d', row-1, col-1);
        }

        if(col > 1){
            problem3(p+'R', row, col-1);
        }
    }

    // Problem 4: Print all possible paths to reach the bottom-right corner from the top-left corner in a grid, moving right ('R'), down ('D') with an obstacle in any of the block of a grid
    public static void problem4(String p, boolean[][] maze, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length-1){
            problem4(p+'D', maze, row+1, col);
        }

        if(col < maze[0].length-1){
            problem4(p+'R', maze, row, col+1);
        }
    }
}
