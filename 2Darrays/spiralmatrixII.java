public class spiralmatrixII {
    public static void main(String[] args) {
        spiralmatrixII sm = new spiralmatrixII();
        int n = 3; // Example size
        int[][] matrix = sm.generateMatrix(n);

        // Print the generated matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        int value = 0;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right (left -> right)
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = ++value;
            }
            rowStart++;

            // Traverse down (top -> bottom)
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = ++value;
            }
            colEnd--;

            // Traverse left (right -> left)
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = ++value;
                }
                rowEnd--;
            }

            // Traverse up (bottom -> top)
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = ++value;
                }
                colStart++;
            }
        }

        return matrix;
    }
}