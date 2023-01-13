package TwoDArray;

import java.util.Arrays;

public class Sorted2DMatrixBS {

    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5},{6,7,8},{9,10,11}
        };
        System.out.println(Arrays.toString(search(arr,3)));
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // matrix may be empty

        if(rows == 1){
            return  binarySearch(matrix,0,0,matrix[0].length,target);
        }

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols/2;

        // run loop while 2 rows are remaining
        while(rStart < (rEnd -1)){
            int mid =rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }
            if (matrix[mid][cMid] > target){
                rEnd = mid;
            }else {
                rStart = mid;
            }
        }

        // two rows are left
        // check whether target is in the col of 2 rows

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }

        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        //search in the first half
        if(target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }

        //search in the first half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);

        }
        //search in the first half
        if(target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }else {
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }

    }

    // search in the row provided and for the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd,int target){
        while(cStart > cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }
            if(matrix[row][mid] > target){
                cEnd =mid-1;
            }else{
                cStart = mid +1;
            }
        }
        return new int[] {-1,-1};
    }
}
