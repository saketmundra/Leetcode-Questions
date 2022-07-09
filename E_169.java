package com.company;

import java.util.HashMap;

public class E_169 {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int k=hm.get(nums[i]);
                k++;
                hm.put(nums[i],k);
                if(k> nums.length/2){
                    max=nums[i];
                }
            }
            else {
                hm.put(nums[i],1);
                if(nums.length<=1){
                    return nums[i];
                }
            }
        }
        return max;



    }
}
