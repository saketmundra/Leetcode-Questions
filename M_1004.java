package com.company;

public class M_1004 {
    public static void main(String[] args) {

    }
    public int longestOnes(int[] nums, int k) {
        int st=0,en=0,max=Integer.MIN_VALUE;
        while (en< nums.length){
            if(k>0){
                if(nums[en]==0){
                    k--;
                }
                max=Math.max(max,en-st+1);
                en++;
            }
            else if(k==0){
                if(nums[en]==1){
                    max=Math.max(max,en-st+1);
                    en++;
                }
            }
            else{
                while(nums[st]!=0 && st<en){
                    st++;
                }
                st++;
                k++;
                max=Math.max(max,en-st+1);
            }
        }
        return max;

    }
}
