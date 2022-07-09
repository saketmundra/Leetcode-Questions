package com.company;

public class M_494 {
    public static void main(String[] args) {

    }

    public int findTargetSumWays(int[] nums, int target) {
        printtarget(nums,0,0,target);
        return k;

    }
    static int k=0;
    public static void printtarget(int [] arr,int idx,int sos,int tar){
        if(idx==arr.length){
            if(sos==tar){
                k++;
            }
            return;
        }
        printtarget(arr,idx+1,sos+arr[idx],tar);
        printtarget(arr,idx+1,sos-arr[idx],tar);

    }
}
