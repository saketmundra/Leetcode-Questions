package com.company;

import java.util.PriorityQueue;

public class H_1289 {
    public int minFallingPathSum(int[][] grid) {
        if(grid.length==1) return grid[0][0];
        int n=grid.length;
        int [][] dp=new int [n][n];
        int min1=0; //1st minimum
        int min2=0; //2nd minimum

        for(int i=n-1;i>=0;i--){
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int j=0;j<n;j++){
                if(i==n-1) dp[i][j]=grid[i][j];
                else{
                    if(dp[i+1][j]!=min1) dp[i][j]=grid[i][j]+min1;
                    else dp[i][j]=grid[i][j]+min2;
                }
                pq.add(dp[i][j]);
            }
            min1=pq.poll();
            min2=pq.poll();
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,dp[0][i]);
        }
        return ans;

    }
}
