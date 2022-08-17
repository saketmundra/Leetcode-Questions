package com.company;

import java.util.*;

public class M_16 {
    public static void main(String[] args) {

    }
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==3) return nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int f=i+1;
            int b= nums.length-1;
            while (f<b){
                int sum=nums[f]+nums[b]+nums[i];
                if(sum<0) f++;
                else if(sum>0) b--;
                else{


                    while (f<b && nums[f]==nums[f-1]) f++;
                    while (f<b && nums[b]==nums[b+1]) b--;
                }
            }
        }
        return 0;

    }

}
