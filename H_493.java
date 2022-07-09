package com.company;

import java.util.HashSet;

public class H_493 {
    public static void main(String[] args) {


    }
    public int reversePairs(int[] nums) {
        int pairs=0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]>2*nums[j]) pairs++;
            }
        }
        return pairs;


    }


}
