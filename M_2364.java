package com.company;

public class M_2364 {
    public static void main(String[] args) {

    }
    public long countBadPairs(int[] nums) {

        int badPairs = 0;
        for (int i = 0; i <nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]!=j-i) badPairs++;

            }
        }
        return badPairs;

    }
}
