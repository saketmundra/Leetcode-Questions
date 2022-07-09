package com.company;

public class H_1312 {
    public static void main(String[] args) {

    }
    public int minInsertions(String s) {
        int [][] dp=new int[s.length()][s.length()];

        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<dp.length;i++,j++){
                if(g==0){
                    dp[i][j]=0;

                }
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=0;

                    }
                    else {
                        dp[i][j]=1;
                    }
                }
                else {
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=dp[i+1][j-1];
                    }
                    else {
                        dp[i][j]=Math.min(dp[i][j-1],dp[i+1][j])+1;

                    }
                }

            }
        }
        return dp[0][s.length()-1];

    }

}
