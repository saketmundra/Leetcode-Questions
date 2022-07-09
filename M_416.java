package com.company;

import java.util.Arrays;

public class M_416 {
    public static void main(String[] args) {

    }
    public boolean canPartition(int[] nums) {
        int sum= Arrays.stream(nums).sum();
        if(sum%2==1) return false;
        sum=sum/2;
        boolean [][] dp=new boolean[nums.length+1][sum+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]= true;
                }
                else if(i==0){
                    dp[i][j]= false;
                }
                else if(j==0){
                    dp[i][j]= true;
                }
                else{
                    dp[i][j] = dp[i-1][j];
                    if (j >= nums[i-1]) {
                        dp[i][j] = (dp[i][j] || dp[i-1][j-nums[i-1]]);
                    }
                }
            }
        }
        return dp[nums.length][sum];



    }

}
