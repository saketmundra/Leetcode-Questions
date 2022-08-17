package com.company;

public class M_96 {
    public static void main(String[] args) {

    }
    public int numTrees(int n) {
        int [] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int ans=0;
            for(int j=0;j<i;j++){
                ans+=dp[j]*dp[i-j];
            }
            System.out.println(ans);
            dp[i]=ans;
        }
        return dp[n];

    }

}
