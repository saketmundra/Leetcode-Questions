package com.company;

import java.util.HashSet;

public class H_41 {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i< nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return 0;



    }
}
