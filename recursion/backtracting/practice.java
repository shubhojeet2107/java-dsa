package recursion.backtracting;

public class practice {
    public static void main(String[] args){
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };

        count("", maze, 0, 0);
    }

    public static void count(String p, boolean[][] maze, int row, int col){
        if(row == 2 && col == 2){
            System.out.println(p);
            return;
        }

        if(maze[row][col]==false){
            return;
        }

        if(row < 2){
            count(p+'D', maze, row+1, col);
        }

        if(col < 2){
            count(p+'R', maze, row, col+1);
        }
    }
}
