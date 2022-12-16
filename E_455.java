package com.company;

import java.util.Arrays;

public class E_455 {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int ans=0;

        while(i<s.length && j<g.length){
            if(s[i]>=g[j]){
                i++;j++;ans++;
            }
            else{
                i++;
            }
        }
        return ans;

    }
}