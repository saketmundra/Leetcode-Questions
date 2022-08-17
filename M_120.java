package com.company;
import java.util.*;

public class M_120 {
    public static void main(String[] args) {

    }
    public int minimumTotal1(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [][]dp=new int[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(i==n-1){
                    dp[i][j]=triangle.get(i).get(j);
                }
                else{
                    dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);

                }
            }
        }
        return dp[0][0];

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        return(ans(triangle,0,0));
    }
    public int ans(List<List<Integer>> triangle,int i,int j) {
        if(i==triangle.size()-1) return triangle.get(i).get(j);
        int down=triangle.get(i).get(j)+ans(triangle,i+1,j);
        int dig=triangle.get(i).get(j)+ans(triangle,i+1,j+1);
        return Math.min(down,dig);

    }
}
