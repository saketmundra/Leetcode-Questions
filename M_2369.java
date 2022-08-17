package com.company;

import java.util.HashMap;

public class M_2369 {
    public static void main(String[] args) {

    }
    public boolean validPartition(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!hs.containsKey(nums[i])){
                hs.put(nums[i],1);
            }
            else{
                int a=hs.get(nums[i]);
                a++;
                hs.put(nums[i],a);
            }
        }
        for(int i=0; i<nums.length; i++){

        }

    }
}
