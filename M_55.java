package com.company;

public class M_55 {
    public static void main(String[] args) {

    }
    static boolean ans;
    public boolean canJump(int[] nums) {
        int[] visited=new int [nums.length];
        recur(nums,0,visited);
        return ans;
    }
    public void recur(int []nums,int idx,int [] visited){
        if(idx==nums.length-1) ans=true;
        if(visited[idx]==1) return;
        visited[idx]=1;
        for(int i=1;i<=nums[i] && idx+i<nums.length;i++){
            recur(nums,idx+i,visited);
        }
        return;
    }
    public boolean canJump2(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }


//             int [] dp=new int [nums.length];
//         dp[0]=0;
//         for(int i=1;i<nums.length;i++){
//             int min=Integer.MAX_VALUE;
//             for(int j=1;j<=i;j++){
//                 if(nums[i-j]>=j && dp[i-j]!=Integer.MAX_VALUE){
//                     min=Math.min(min,dp[j]+1);
//                 }
//             }
//             dp[i]=min;
//         }
//                 for(int i=0;i<dp.length;i++){
//             System.out.print(dp[i]+" ");
//         }
//         return dp[nums.length-1]!=Integer.MAX_VALUE;
}
