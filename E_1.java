package com.company;

import java.util.HashMap;
import java.util.Hashtable;

public class E_1 {
    public static void main(String[] args) {
        System.out.println("saket");
        System.out.println();

    }
    public int[] twoSum(int[] nums, int target) {
        int [] ans=new int[2];
        HashMap <Integer,Integer> hs=new HashMap<>();
        hs.put(target-nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                ans[0]=hs.get(nums[i]);
                ans[0]=i;
                return ans;
            }
            hs.put(target-nums[i],i);
        }
        return ans;
    }
}
