package com.company;

import java.util.Arrays;

public class M_650 {
    public static void main(String[] args) {

    }
    public int minSteps(int n) {
        if(n==1) return 0;
        return recurr(1,1,1,n,0);//0 is for copy and 1 is for paste
    }
    int recurr(int stlen,int copy,int steps,int len,int cp){
        if(stlen==len)return steps;
        else if(stlen+copy==len)return steps+1;
        if(stlen>len || stlen+copy>len)return Integer.MAX_VALUE;
        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
        if(cp!=0){
            a=recurr(stlen,stlen,steps+1,len,0);
        }
        b=recurr(stlen+copy,copy,steps+1,len,1);
        return Math.min(a,b);
    }
}
