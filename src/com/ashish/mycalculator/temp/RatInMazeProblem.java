package com.ashish.mycalculator.temp;
import java.util.*;
public class RatInMazeProblem {
    public static boolean isvalid(int i,int j,int mat[][],boolean vis[][],int n, int m) {
        if (i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && !vis[i][j]) {
            return true;
        }
        return false;
    }
    public static void rateInmaze(int mat[][],boolean vis[][],int i, int j,String path,int n, int m) {
        //base case
        if (i == n-1 && j == m-1) {
            System.out.println(path);
            return;
        }
        if (isvalid(i+1,j,mat,vis,n,m)) {
            vis[i+1][j] = true;
            rateInmaze(mat,vis,i+1,j,path+'D',n,m);
            vis[i+1][j] = false;
        }

        if (isvalid(i,j+1,mat,vis,n,m)) {
            vis[i][j+1] = true;
            rateInmaze(mat,vis,i,j+1,path+'R',n,m);
            vis[i][j+1] = false;
        }

        if (isvalid(i-1,j,mat,vis,n,m)) {
            vis[i-1][j] = true;
            rateInmaze(mat,vis,i-1,j,path+'U',n,m);
            vis[i-1][j] = false;
        }

        if (isvalid(i,j-1,mat,vis,n,m)) {
            vis[i][j-1] = true;
            rateInmaze(mat,vis,i,j-1,path+'L',n,m);
            vis[i][j-1] = false;
        }
    }
    public static void main(String[] args) {
        int mat[][] = {
                {1,1,1,0},
                {1,0,0,1},
                {1,1,0,0},
                {1,1,1,1},
        };

        int n = mat.length;
        int m = mat[0].length;

        boolean vis[][] = new boolean[n][m];
        vis[0][0] = true;

        rateInmaze(mat,vis,0,0,"",n,m);
    }
}
