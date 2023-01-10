package com.company;

import java.util.Arrays;

public class H_1463 {
    public static void main(String[] args) {

    }
    public int cherryPickup(int[][] grid) {
        int m= grid.length;
        int n=grid[0].length;
        int [][][] dp=new int[m][n][n];
        Arrays.fill(dp,-1);
        return Math.max(0,f(0,0,n-1, m,n,grid,dp));
    }
    int f(int i,int j1,int j2,int r,int c,int[][] grid,int [][][] dp){
        if(j1<0 || j2<0 || j1>=c || j2>=c){
            return  Integer.MIN_VALUE;
        }
        if(i==r-1){
            if(j1==j2)return grid[i][j1];
            else return grid[i][j1]+grid[i][j1];
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        int max=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
                if(j1==j2)value=grid[i][j1];
                else value=grid[i][j1]+grid[i][j2];
                value+=f(i+1,j1+dj1,j2+dj2,r,c,grid,dp);
                max=Math.max(max,value);
            }
        }
        return dp[i][j1][j2]=max;
    }
}
