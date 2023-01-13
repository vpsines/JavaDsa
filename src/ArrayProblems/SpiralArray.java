package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = spiralOrder(arr);
        System.out.println(res);
    }

    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        int rowStart = 0;
        int rowEnd = matrix.length -1;
        int colStart = 0;
        int colEnd=matrix[0].length-1;



        while(rowStart <= rowEnd && colStart <= colEnd){
            // from left to right
            for(int i= colStart; i<=colEnd;i++){
                res.add(matrix[rowStart][i]);
            }
            rowStart +=1;

            // from top to bottom
            for(int i= rowStart; i<=rowEnd;i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd -=1;

            // from right to left
            if(rowStart<=rowEnd){
                for(int i= colEnd; i>=colStart;i--){
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd -=1;
            }

            // from bottom to top
            if(colStart<=colEnd){
                for(int i= rowEnd; i>=rowStart;i--){
                    res.add(matrix[i][colStart]);
                }
                colStart +=1;
            }

        }
        return res;
    }
}
