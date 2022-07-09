package com.company;

public class M_5 {
    public static void main(String[] args) {

    }
    public String longestPalindrome(String s) {

        boolean [][] dp=new boolean[s.length()][s.length()];
        String ans="";
        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<dp.length;i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }
                }
                else {
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }
                }
                if(dp[i][j]==true){//collecting the string from the above loops whichever runs the last.
                    ans = s.substring(i, j+1);
                }
            }
        }
        return ans;


    }
}
