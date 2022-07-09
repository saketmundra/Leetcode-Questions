package com.company;

public class M_152 {
    public static void main(String[] args) {

    }
    class Solution {

        public int maxProduct(int[] nums) {


            int max=nums[0];
            int min=nums[0];
            int ans=max;

            for(int i=1;i<nums.length;i++){
                if(nums[i]<0){
                    int temp=max;
                    max=min;
                    min=temp;
                }
                max=Math.max(nums[i]*max,nums[i]);
                min=Math.min(nums[i]*min,nums[i]);
                ans=Math.max(ans,max);
            }
            return max;








        }
    }
}
