package com.company;

public class M_63 {
    public static void main(String[] args) {

    }
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m=obstacleGrid.length;
            int n=obstacleGrid[0].length;
            if(obstacleGrid[m-1][n-1]==1) return 0;
            if(m==1 &&n==1){
                return 1;
            }


            int arr[][]=new int[m][n];
            arr[m-1][n-1]=0;
            for(int i=m-1;i>=0;i--){
                for(int j=n-1;j>=0;j--){
                    if(i==m-1 && j==n-1){
                        arr[i][j]=0;
                    }
                    else if(i==m-1){
                        if(obstacleGrid[i][j]==1 || arr[i][j+1]==0 ){
                            arr[i][j]=0;
                        }
                        else arr[i][j]=1;

                    }
                    else if(j==n-1){
                        if(obstacleGrid[i][j]==1 || arr[i+1][j]==0){
                            arr[i][j]=0;
                        }
                        else arr[i][j]=1;
                    }
                    else{
                        if(obstacleGrid[i][j]==1){
                            arr[i][j]=0;
                        }
                        else arr[i][j]=arr[i+1][j]+arr[i][j+1];
                    }

                }
            }
            return arr[0][0];

        }
    }
}
