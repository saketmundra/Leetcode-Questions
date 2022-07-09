package com.company;

public class E_53 {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        //Kadanes algo
        int currMax=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            currMax=Math.max(currMax+nums[i],nums[i]);
            max=Math.max(max,currMax);
        }
        return max;

    }

}
