import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class spiralmatrix {
    public static void main(String[] args){
        spiralmatrix sm = new spiralmatrix();
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        List<Integer> list = sm.spiralOrder(matrix);
        System.out.println(list);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int colBegin = 0;
        int colEnd = matrix[0].length-1;
        int rowBegin = 0;
        int rowEnd = matrix.length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            
            // Traverse right (left -> right)
            for(int i=colBegin; i<=colEnd; i++){
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            // Traverse down (top -> bottom)
            for(int i=rowBegin; i<=rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Traverse left (bottom -> left)
            if(rowBegin < rowEnd){
                for(int i=colEnd; i>=colBegin; i--){
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            // Traverse up (bottom -> top)
            if(colBegin <= colEnd){
                for(int i=rowEnd; i>=rowBegin; i--){
                    list.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return list;
    }
}