package com.company;
import java.util.*;


public class H_2035 {
    public static void main(String[] args) {

    }
    public int minimumDifference(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.abs(nums[i]);
        }
        int min=Integer.MAX_VALUE;
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
                        dp[i][j] = (dp[i][j] || dp[i - 1][j - nums[i - 1]]);
                    }
                }
                if(i==dp.length-1 && dp[i][j]==true){
                    min=Math.min(min,Math.abs((sum-j)-j));
                }
            }
        }
        return min;




    }
}
