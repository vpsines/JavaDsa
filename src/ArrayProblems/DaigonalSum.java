package ArrayProblems;

public class DaigonalSum {
    static int diagonalSum(int[][] mat) {
        int n = mat.length -1;
        int sum =0;
        int mid = n/2;

        if(mat.length % 2 == 0){
            sum = sum + mat[mid][mid]+ mat[mid+1][mid+1]+ mat[mid+1][mid]+ mat[mid][mid+1];
            for(int i = 0; i < mid;i++){
                sum = sum + mat[i][i] + mat[i][n-i];
            }
            for(int i = mid+2; i <=n;i++){
                sum = sum + mat[i][i] + mat[i][n-i];
            }
        }    else{
            sum += mat[mid][mid];
            for(int i = 0; i < mid;i++){
                sum = sum + mat[i][i] + mat[i][n-i];
            }
            for(int i = mid+1; i <=n;i++){
                sum = sum + mat[i][i] + mat[i][n-i];
            }
        }

        return sum;
    }
}
