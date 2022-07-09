package com.company;

public class M_519 {
    public static void main(String[] args) {

    }

    public int longestPalindromeSubseq(String s) {
        int [][] dp=new int[s.length()][s.length()];

        //how to move diagonally in a matrix
        for(int g=0;g<s.length();g++){
            //each diagonal loops around starting pt(j) and ending pt(i)
            //of a string and it stores longest palindrome

            for(int i=0,j=g;j<dp.length;i++,j++){

                if(g==0){
                    dp[i][j]=1;
                }
                else if(g==1){
                    dp[i][j]=s.charAt(i)==s.charAt(j)?2:1;//if-else
                }
                else {
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=dp[i+1][j-1]+2;
                    }
                    else{
                        dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                    }

                }

            }
        }
        return dp[0][s.length()-1];




    }

}
