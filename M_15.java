package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_15 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> res=new ArrayList<>();
        if(nums.length < 3) return res;


        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int f=i+1;
            int b= nums.length-1;
            while (f<b){
                int sum=nums[f]+nums[b]+nums[i];
                if(sum<0) f++;
                else if(sum>0) b--;
                else{
                    List<Integer> trio=new ArrayList<>();
                    trio.add(nums[i]);
                    trio.add(nums[f]);
                    trio.add(nums[b]);
                    res.add(trio);
                    f++;
                    b--;

                    while (f<b && nums[f]==nums[f-1]) f++;
                    while (f<b && nums[b]==nums[b+1]) b--;
                }
            }
        }
        return res;
    }
}
