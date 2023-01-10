package com.company;

public class H_801 {
    public static void main(String[] args) {

    }
    public int minSwap(int[] nums1, int[] nums2) {
        int [] n1=new int[nums1.length+1];
        int [] n2=new int[nums1.length+1];
        n1[0]=-1;n2[0]=-1;
        for(int i=1;i<n1.length;i++){
            n1[i]=nums1[i-1];
            n2[i]=nums2[i-1];
        }
        int [][] dp=new int[n1.length][2];
        int swapped=0;
        return solve(n1,n2,1,swapped,dp);

    }
    int solve(int[] nums1, int[] nums2,int i,int swapped,int [][] dp){
        if(i==nums1.length)return 0;
        if(dp[i][swapped]!=0)return dp[i][swapped];
        int ans=Integer.MAX_VALUE;

        int prev1=nums1[i-1];
        int prev2=nums2[i-1];

        if(swapped==1){
            int tep=prev1;
            prev1=prev2;
            prev2=tep;
        }
        if(nums1[i]>prev1 && nums2[i]>prev2){
            ans=solve(nums1,nums2,i+1,0,dp);
        }
        if(nums1[i]>prev2 && nums2[i]>prev1){
            ans=Math.min(ans,1+solve(nums1,nums2,i+1,1,dp));
        }
        return dp[i][swapped]=ans;
    }

}
