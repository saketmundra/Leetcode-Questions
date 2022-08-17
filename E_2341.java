package com.company;
import java.util.*;

public class E_2341 {
    public static void main(String[] args) {

    }
    public int[] numberOfPairs(int[] nums) {
        HashSet hs=new HashSet();
        int [] ans=new int[2];
        int pairs=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                pairs++;
                hs.remove(nums[i]);
            }
        }
        ans[0]=pairs;
        ans[1]=hs.size();
        return ans;


    }
}
