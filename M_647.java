package com.company;

public class M_647 {
    public static void main(String[] args) {

    }
    public int countSubstrings(String s) {
        int [][] dp=new int[s.length()][s.length()];
        int ans=0;

        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<dp.length;i++,j++){
                if(g==0){
                    dp[i][j]=1;
                    ans++;
                }
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=1;
                        ans++;
                    }
                }
                else {
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                        dp[i][j]=1;
                        ans++;
                    }
                }

            }
        }
        return ans;

    }
}
