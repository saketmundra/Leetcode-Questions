package com.company;
import java.util.*;
public class M_78 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        if(nums.length==0) return res;
        ans(nums,res,0,new ArrayList<Integer>());
        return res;

    }
    public void ans(int[] nums,List<List<Integer>>res,int idx,ArrayList<Integer> curr) {
        res.add(new ArrayList<Integer>(curr));
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            ans(nums,res,idx+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}
