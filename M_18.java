package com.company;
import com.sun.jdi.connect.Connector;

import java.util.*;

public class M_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        if (nums==null || nums.length==0){
            return res;
        }
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int target2=target-nums[i]-nums[j];
                int f=j+1;//front
                int b=n-1;//back
                while (b>f){
                    int twosum=nums[f]+nums[b];
                    if(twosum>target2) b--;
                    else if(twosum<target2)f++;
                    else {
                        List<Integer> quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[f]);
                        quad.add(nums[b]);
                        res.add(quad);

                        //processing duplicates for 3rd no.
                        while (f<b && nums[f]==quad.get(2)) f++;
                        //processing duplicates for 4th no.
                        while (f<b && nums[b]==quad.get(3)) b--;

                    }
                }
                //processing duplicates for 2nd no.
                while (j+1<n && nums[j]==nums[j+1]) j++;

            }
            //processing duplicates for 2nd no.
            while (i+1<n && nums[i]==nums[i+1]) i++;
        }
        return res;

    }
}
