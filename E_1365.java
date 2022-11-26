package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class E_1365 {
    public static void main(String[] args) {

    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int [] temp=nums.clone();
        Arrays.sort(temp);
        for(int i=0;i< temp.length;i++){
            if(!hs.containsKey(temp[i])){
                hs.put(temp[i],i);
            }
        }
        System.out.println(hs);
        int [] ans=new int[nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=hs.get(nums[i]);
        }
        return ans;


    }
}
