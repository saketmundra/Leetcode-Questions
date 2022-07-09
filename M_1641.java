package com.company;

public class M_1641 {
    public static void main(String[] args) {

    }
    public int countVowelStrings(int n) {
        int [][] dp=new int[n][5];
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                if(i==0){
                    dp[i][j]=j+1;
                }
                else if(j==0){
                    dp[i][j]=1;
                }
                else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[n-1][4];
    }
}
