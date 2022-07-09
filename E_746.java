package com.company;

public class E_746 {
    public static void main(String[] args) {

    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int [] arr=new int[n+1];

        arr[n]=0;
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                arr[i]=cost[i]+arr[i+1];
            }
            else{
                arr[i]=cost[i]+Math.min(arr[i+2],arr[i+1]);
            }
        }
        return Math.min(arr[0],arr[1]);
    }
    public int minCostClimbingStairs2(int[] cost) {
        int n = cost.length;
        int[] opt = new int[n + 1];
        opt[0] = 0; // init
        opt[1] = 0;
        for (int i = 2; i <= n; ++i) {
            opt[i] = Math.min(opt[i - 1] + cost[i - 1], opt[i - 2] + cost[i - 2]);
        }
        return opt[n];
    }
}
