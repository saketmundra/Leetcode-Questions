package com.company;

import java.util.Arrays;

public class M_34 {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        if(nums[0]>target || nums[nums.length-1]>target){
            Arrays.fill(ans,-1);
            return ans;
        }
        int st=0;
        int end=nums.length-1;
        while(nums[st]!=nums[end]){
            if(nums[st]!=target){
                st++;
            }
            if(nums[end]!=target){
                end++;
            }
        }
        ans[0]=st;
        ans[1]=end;
        return ans;

    }
    public int mySqrt(int x) {
        return (int)Math.pow(x,0.5);
    }
}
