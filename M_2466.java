package com.company;

public class M_2466 {
    public static void main(String[] args) {

    }
    int mod=1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
        int ans=0;
        int [] dp=new int [high+1];
        for(int i=0;i<high+1;i++){
            dp[i]=-1;
        }
        for(int i=low;i<=high;i++){
            ans+=funx(i,zero,one,dp)%mod;
        }
        return ans%mod;
    }
    public int funx(int len,int zero, int one,int [] dp) {
        if(len==0) return 1;
        if(len<0) return 0;
        if(dp[len]!=-1)return dp[len]%mod;
        return dp[len]=funx(len-zero,zero,one,dp)%mod+funx(len-one,zero,one,dp)%mod;
    }
}
