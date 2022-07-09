package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class M_347 {
    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==k) return nums;
        ArrayList<Integer> arr=new ArrayList();
        Arrays.sort(nums);
        int max=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]){
                max++;
            }
            else{
                arr.add(max);
                max=1;
            }
        }
        arr.add(max);
        Collections.sort(arr);
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<k;i++){
            System.out.println(arr.get(i));
            hs.add(arr.get(i));
        }
        max=1;
        int o=0;
        int [] ans=new int[k];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]){
                max++;
            }
            else{
                if(hs.contains(max)){
                    ans[o]=nums[i-1];
                    o++;
                }
                max=1;
            }
        }
        return ans;



    }
}
