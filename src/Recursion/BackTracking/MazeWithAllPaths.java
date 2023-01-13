package Recursion.BackTracking;

import java.util.Arrays;

public class MazeWithAllPaths {
    public static void main(String[] args) {
        boolean[][] m = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        printAllPaths("",m,0,0);

        int[][] path = new int[m.length][m[0].length];
        printAllPathsWithStep("",m,0,0,path,1);
    }

    static void printAllPaths(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        // considering this cell in path
        maze[r][c] = false;

        if(r < maze.length-1){
            printAllPaths(p+"D",maze,r+1,c);
        }

        if(c < maze[0].length-1){
            printAllPaths(p+"R",maze,r,c+1);
        }

        if (r >0){
            printAllPaths(p+"U",maze,r-1,c);
        }

        if (c > 0){
            printAllPaths(p+"L",maze,r,c-1);
        }

        // this is the line where function would be over
        // so before function gets removed,
        // also remove the changes that were made by the function
        maze[r][c] = true;
    }

    static void printAllPathsWithStep(String p,boolean[][] maze,int r,int c,int [][]path,int step){
        if(r==maze.length-1 && c == maze[0].length-1){
            for (int[] a: path){
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }
        // considering this cell in path
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1){
            printAllPathsWithStep(p+"D",maze,r+1,c,path,step+1);
        }

        if(c < maze[0].length-1){
            printAllPathsWithStep(p+"R",maze,r,c+1,path,step+1);
        }

        if (r >0){
            printAllPathsWithStep(p+"U",maze,r-1,c,path,step+1);
        }

        if (c > 0){
            printAllPathsWithStep(p+"L",maze,r,c-1,path,step+1);
        }

        // this is the line where function would be over
        // so before function gets removed,
        // also remove the changes that were made by the function
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
