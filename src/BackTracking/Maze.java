package Recursion.BackTracking;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        printPaths("",3,3);
//        printPathsWithDiagonal("",3,3);

        boolean[][] m = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathWithObstacles("",m,0,0);
    }

    static int count(int r,int c){
        if(r==1 || c ==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }

    // D : Down
    // R : Right
    static void printPaths(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            printPaths(p+"D",r-1,c);
        }
        if(c>1){
            printPaths(p+"R",r,c-1);
        }
    }

    // D : Diagonal
    // V : Vertical
    // H : Horizontal
    static void printPathsWithDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if( r>1 && c>1){
            printPathsWithDiagonal(p+"D",r-1,c-1);
        }
        if(r>1){
            printPathsWithDiagonal(p+"V",r-1,c);
        }
        if(c>1){
            printPathsWithDiagonal(p+"H",r,c-1);
        }
    }

    static void pathWithObstacles(String p,boolean[][] maze,int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        // if its an obstacle
        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1){
            pathWithObstacles(p+"V",maze,r+1,c);
        }
        if(c < maze[0].length -1){
            pathWithObstacles(p+"H",maze,r,c+1);
        }
    }
}
