package com.company;

public class H_1681 {
    public static void main(String[] args) {

    }
    public int minimumMountainRemovals(int[] nums) {
        int []dp=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int maxlen=0;
            for(int j=0;j<i;j++){
                if(nums[i]>=nums[j]){
                    maxlen=Math.max(maxlen,dp[j]);
                }
            }
            dp[i]=maxlen+1;
        }
        int []ds=new int [nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int minlen=0;
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]>=nums[j]){
                    minlen=Math.max(minlen,ds[j]);
                }
            }
            ds[i]=minlen+1;
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,dp[i]+ds[i]-1);
        }
        return max;



    }
}
