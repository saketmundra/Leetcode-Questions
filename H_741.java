package com.company;

public class H_741 {
    public static void main(String[] args) {

    }
    public String capitalizeTitle(String title) {
        String ans="";
        int len=0;
        for(int i=title.length()-2;i>=0;i--){
            char ch=title.charAt(i);
            len++;
            if(title.charAt(i-1)==' '){
                if(len>3)ans=Character.toUpperCase(ch)+ans;
                else ans=' '+Character.toLowerCase(ch)+ans;
                len=0;
                i++;
            }
            else{
                ans=Character.toLowerCase(ch)+ans;
            }
        }
        return len>2?Character.toUpperCase(title.charAt(0))+ans:Character.toLowerCase(title.charAt(0))+ans;


    }
    public int cherryPickup(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int [][][][] dp=new int[m][n][m][n];

        return f(0,0,0,0,m,n,grid,dp);

    }
    int f(int r1,int c1,int r2,int c2,int rows,int col,int[][]grid,int [][][][] dp){
        if(c1>=col || c2>=col || r1>=rows ||r2>=rows || grid[r1][c1]==-1 || grid[r2][c2]==-1){
            return Integer.MIN_VALUE;
        }
        if(r1==rows-1 && c1==col-1){
            return grid[r1][c1];
        }
        if(dp[r1][c1][r2][c2]!=0)return dp[r1][c1][r2][c2];
        int cherries=0;
        if(r1==r2 && c1==c2)cherries+=grid[r1][c1];
        else cherries+=grid[r1][c1]+grid[r2][c2];

        int f1=f(r1+1,c1,r2+1,c2,rows,col,grid,dp);
        int f2=f(r1,c1+1,r2,c2+1,rows,col,grid,dp);
        int f3=f(r1+1,c1,r2,c2+1,rows,col,grid,dp);
        int f4=f(r1,c1+1,r2+1,c2,rows,col,grid,dp);

        cherries=Math.max(Math.max(f1,f2),Math.max(f3,f4));
        return dp[r1][c1][r2][c2]=cherries;
    }
}
