package com.company;

/**
 * InnerM_213
 */
public class M_213 {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        if(nums.length==3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        int a= nums[nums.length-1];
        nums[nums.length-1]=0;
        int op1=ro2(nums);
        nums[nums.length-1]=a;
        nums[0]=0;
        int op2=ro2(nums);
        return Math.max(op1, op2);
    }
    public int ro2(int[] nums) {
        int [] dp=new int [nums.length+1];
        if(nums.length==1) return nums[0];
        dp[1]=nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        dp[2]=Math.max(nums[0], nums[1]);

        for(int i=3;i<=nums.length;i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
        
    }

    
}
