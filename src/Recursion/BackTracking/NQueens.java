package Recursion.BackTracking;

public class NQueens {

    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board,int row){
        // all the queens have been placed
        if(row == board.length){
            display(board);
            return 1;
        }

        // FOR PLACING QUEEN
        // checking for every row and col
        int count =0;

        for(int col=0; col< board.length; col++){
            // place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board, row+1);

                // backtracking
                board[row][col] = false;
            }
        }
        return count;
    }

    static void display(boolean[][] board){
        for (boolean[] b:board) {
            for (boolean a : b) {
                if (a) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(boolean[][] board,int row,int col){
         // for vertical check
        for(int i=0;i<row;i++){
            if(board[i][col]){
               return false;
            }
        }

        // for left diagonal check
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // for right diagonal check
        int maxRight= Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
}
