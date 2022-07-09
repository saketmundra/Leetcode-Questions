package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class M_1679 {
    public static void main(String[] args) {

    }
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],1);
        int ans=0;

        for(int i=1;i<nums.length;i++){
            if(map.containsKey(k-nums[i])&&map.get(k-nums[i])>0){
                ans++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }else{

                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }

        }
        return ans;


    }
}
