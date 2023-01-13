package TwoDArray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5},{6,7,8},{9,10,11}
        };
        System.out.println(Arrays.toString(search(arr,4)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[] {row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
