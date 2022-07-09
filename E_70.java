package com.company;

public class E_70 {
    public static void main(String[] args) {

    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];

        dp[0]=1;
        for(int i=1;i<dp.length;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public int climbStairs_memo(int n, int[] dp) {
        if(n <= 1)
            return dp[n] = 1;

        if(dp[n] != 0)
            return dp[n];

        int step = climbStairs_memo(n-1, dp) + climbStairs_memo(n-2, dp);

        return dp[n] = step;
    }
    public int climbStairsmemo(int n) {
        int[] dp = new int[n + 1];
        int ans = climbStairs_memo(n, dp);
        return ans;
    }

}
