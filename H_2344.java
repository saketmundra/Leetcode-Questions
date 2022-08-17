package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class H_2344 {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int ans=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(hs.contains(nums[i])){
                ans++;
            }
            else{
                for(int j=0;j<numsDivide.length;j++) {
                    if(numsDivide[j]%nums[i]!=0){
                        hs.add(nums[i]);
                        ans++;
                        break;
                    }
                    if(j==numsDivide.length-1){
                        return ans;
                    }
                }

            }
        }
        return -1;

    }
}
