package ArrayProblems;

public class OddCells {
    public static void main(String[] args) {
        int[][] arr = {{0,1}, {1,1}};
        oddCells(2,3,arr);
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int odd = 0;

        for(int i =0; i<indices.length; i++){
            for(int j=0; j<n; j++){
                matrix[indices[i][0]][j] += 1;
            }
            for(int j=0; j<m; j++){
                matrix[j][indices[i][1]] += 1;
            }
        }

        for(int[] x:matrix){
            for(int y: x){
                if(y % 2==1){
                    odd++;
                }
            }
        }

        return odd;
    }

    static int oddCells2(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];

        int odd = 0;

        for(int i =0; i<indices.length; i++){
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }

        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                if((row[i] + col[j])% 2==1){
                    odd++;
                }
            }
        }

        return odd;
    }
}
