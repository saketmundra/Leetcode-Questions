package com.company;

public class M_931 {
    public static void main(String[] args) {

    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int [][] dp=new int [n][n];

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(i==n-1) dp[i][j]=matrix[i][j];
                else if(j==0) dp[i][j]=matrix[i][j]+Math.min(dp[i+1][j],dp[i+1][j+1]);
                else if(j==n-1) dp[i][j]=matrix[i][j]+Math.min(dp[i+1][j],dp[i+1][j-1]);
                else dp[i][j]=matrix[i][j]+Math.min(dp[i+1][j],Math.min(dp[i+1][j-1],dp[i+1][j+1]));
                System.out.println(dp[i][j]);
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,dp[0][i]);
        }
        return ans;

    }
}
