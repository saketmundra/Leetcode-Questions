package com.company;

public class M_279 {
    public static void main(String[] args) {

    }
    public int numSquares(int n) {
        int[]narr=new int[n+1];
        narr[0]=0;
        narr[1]=1;
        for(int i=2;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int k=i-(j*j);
                min=Math.min(min,narr[k]);
            }
            narr[i]=min+1;
        }
        return narr[n];
    }
}
