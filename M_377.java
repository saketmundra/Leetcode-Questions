package com.company;

public class M_377 {
    public static void main(String[] args) {

    }
    public int combinationSum4(int[] nums, int target) {
        return solve(nums,0,0,target);
    }
    int solve(int[] nums,int idx,int sum, int target){
        if(sum==target)return 1;
        if(idx==nums.length)return 0;

        int a=solve(nums,idx,sum+nums[idx],target);
        int b=solve(nums,idx+1,sum+nums[idx],target);
        int c=solve(nums,idx+1,sum,target);
        return a+b+c;
    }
}
