package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class M_1626 {
    public static void main(String[] args) {

    }
    public int bestTeamScore(int[] scores, int[] ages) {
        int len=scores.length;
        int[][] score=new int[scores.length][2];
        for(int i=0;i<scores.length;i++){
            score[i][0]=scores[i];
            score[i][1]=ages[i];
        }
        Arrays.sort(score,(a,b)->{
            if(a[0]==b[0])
                return a[1]-b[1];
            return a[0]-b[0];
        });
        int[][] dp=new int[len+1][len+1];
        for(int[] arr:dp)
            Arrays.fill(arr,-1);
        return recur(score,0,scores.length-1,-1,dp);
    }
    int recur(int[][] score,int scr,int i,int maxscrind,int[][] dp){
        if(i==-1)return scr;
        int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
        if(dp[scr][i]!=-1)return dp[scr][i];
        if(maxscrind==-1){
            a=recur(score,scr+score[i][0],i-1,i,dp);
            b=recur(score,scr,i-1,-1,dp);
        }
        else {
            if (score[i][1] <= score[maxscrind][1])
                a = recur(score, scr + score[i][0], i - 1,i,dp);
            b = recur(score, scr, i - 1, maxscrind,dp);
        }
        return dp[scr][i]=Math.max(a,b);
    }
}
