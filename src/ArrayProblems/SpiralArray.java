package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/

public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res =new ArrayList<>();
        spiralOrderRecursion(arr,res,0,arr.length-1,0,arr[0].length-1);
        System.out.println(res);

        System.out.println(generateMatrix(3));
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

    static public void spiralOrderRecursion(int[][] matrix,List<Integer> res,int rowStart,int rowEnd,int colStart,int colEnd) {

        if(rowStart > rowEnd || colStart > colEnd){
            return;
        }
        // from left to right
        for(int i= colStart; i<=colEnd;i++){
            res.add(matrix[rowStart][i]);
        }

        // from top to bottom
        for(int i= rowStart; i<=rowEnd;i++){
            res.add(matrix[i][colEnd]);
        }

        // from right to left
        if(rowStart!=rowEnd){
            for(int i= colEnd; i>=colStart;i--){
                res.add(matrix[rowEnd][i]);
            }
        }

        // from bottom to top
        if(colStart!=colEnd){
            for(int i= rowEnd; i>=rowStart;i--){
                res.add(matrix[i][colStart]);
            }
        }
        spiralOrderRecursion(matrix,res,rowStart+1,rowEnd-1,colStart+1,colEnd-1);
    }

    // generate spiral matrix
    static public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int colStart = 0;
        int rowStart=0;
        int colEnd=n-1;
        int rowEnd=n-1;
        int j=1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i=colStart;i<=colEnd;i++)
                res[rowStart][i] = j++;
            rowStart +=1;
            for(int i=rowStart;i<=rowEnd;i++)
                res[i][colEnd]= j++;
            colEnd -=1;
            if(rowStart <= rowEnd){
                for(int i=colEnd;i>=colStart;i--)
                    res[rowEnd][i] = j++;
                rowEnd -=1;
            }
            if(colStart <= colEnd){
                for(int i=rowEnd;i>=rowStart;i--)
                    res[i][colStart] = j++;
                colStart += 1;
            }
        }

        return res;
    }

}
