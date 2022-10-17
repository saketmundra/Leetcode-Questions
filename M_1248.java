package com.company;

import java.util.HashMap;

public class M_1248 {
    public static void main(String[] args) {

    }
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                nums[i]=1;
            }
            else {
                nums[i]=0;
            }
        }
        int sum=0,cnt=0;
        for(int i=0;i<nums.length;i++){
            hs.put(sum,hs.getOrDefault(sum,0)+1);
            sum+=nums[i];
            if(hs.containsKey(sum-k)){
                cnt+=hs.get(sum-k);
            }
        }
        return cnt;

    }
}
