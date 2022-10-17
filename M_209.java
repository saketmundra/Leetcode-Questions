package com.company;

public class M_209 {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,min=Integer.MAX_VALUE;
        while (j<nums.length){
            if(sum+nums[j]>=target){
                min=Math.min(min,j-i+1);
                sum-=nums[i];
                i++;
            }
            else{
                sum+=nums[j];
                j++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;

    }
}
