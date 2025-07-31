public class Search_in2DMatrix {
    public static void main(String[] args){

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (cols == 0) {
            return false;
        }

        if (cols == 1) {
            for (int[] ints : matrix) {
                if (ints[0] == target)
                    return true;
            }
            return false;
        }

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }

        if (matrix[rStart][cMid] == target) {
            return true;
        }
        if (matrix[rStart + 1][cMid] == target) {
            return true;
        }

        if (matrix[rStart][cMid - 1] >= target) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (cMid + 1 < cols && matrix[rStart][cMid + 1] <= target && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    private static boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return true;
            }

            if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }
        return false;
    }
}
