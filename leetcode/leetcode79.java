package leetcode;

public class leetcode79 {
    public static void main(String[] args){
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));  // Output: true
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (backtrack(board, visited, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    static boolean backtrack(char[][] board, boolean[][] visited, int row, int col, String word, int index) {
        if (index == word.length()) return true;

        // bounds and visited check
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length ||
            visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        // explore 4 directions
        boolean found =
            backtrack(board, visited, row + 1, col, word, index + 1) ||
            backtrack(board, visited, row - 1, col, word, index + 1) ||
            backtrack(board, visited, row, col + 1, word, index + 1) ||
            backtrack(board, visited, row, col - 1, word, index + 1);

        visited[row][col] = false; // backtrack

        return found;
    }
}
