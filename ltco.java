package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ltco {
    public static void main(String[] args) {

    }public int maximumValue(String[] strs) {
        int max=0;
        for(int i=0;i<strs.length;i++){
            max=Math.max(max,ans(strs[i]));
        }
        return max;
    }
    public int ans(String str){
        for(int i=0;i<str.length();i++){
            Boolean flag = Character.isDigit(str.charAt(i));
            if(flag)return Integer.parseInt(str);
        }
        return str.length();
    }
    public int maxJump(int[] stones) {
        if(stones.length==2)return stones[2];
        int [] dp=new int[stones.length];
        for(int i=0;i<stones.length;i++){
            if(i==0)dp[i]=0;
            else if(i==1) dp[i]=stones[1]-stones[0];
            else if(i==2) dp[i]=stones[i]-stones[0];
            else{
                dp[i]=stones[i]-stones[i-2];
            }
        }
        return dp[stones.length-1];

    }
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int ans=0;
        ArrayList<ArrayList<Integer>> sum=new ArrayList<>();
        //adding edges
        for(int i=0;i< edges.length;i++){
            if(vals[edges[i][1]]>0) sum.get(edges[i][0]).add(vals[edges[i][1]]);
            if(vals[edges[i][0]]>0) sum.get(edges[i][1]).add(vals[edges[i][0]]);
        }

        for(int i=0;i< vals.length;i++){
            Collections.sort(sum.get(i));
            int t=vals[i];
            for(int j=0;j<Math.min(t,(int)sum.get(i).size());j++){
                t+=sum.get(i).get(j);
            }
            ans=Math.max(ans,t);
        }
        return ans;
    }

}
