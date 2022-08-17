package com.company;

import java.util.HashMap;

public class E_219 {
    public static void main(String[] args) {

    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(!hs.containsKey(nums[i])){
                hs.put(nums[i],i);
            }
            else{
                if(Math.abs(i-hs.get(nums[i]))>k){
                    hs.remove(nums[i]);
                    hs.put(nums[i],i);
                }
                else return false;

            }
        }
        return false;

    }
}
