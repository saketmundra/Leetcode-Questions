package com.company;

import java.util.HashSet;

public class E_2367 {
    public static void main(String[] args) {

    }
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans=0;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                if(nums[j]-nums[i]==diff){
                    if(hs.contains(nums[j]+diff))ans++;
                }
            }
        }
        return ans;



    }
}
