package com.company;
import java.util.*;

public class M_47 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> ans=new LinkedList<>();
            List<Integer> ds=new LinkedList<>();
            boolean freq[]= new boolean[nums.length];
            recurPermute(nums,ans,ds,freq);
            return ans;


        }
        private void recurPermute(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
            if(ds.size()==nums.length){
                ArrayList<Integer> kk=new ArrayList<>(ds);
                if(!ans.contains(kk)){
                    ans.add(kk);
                }
                return;
            }

            for(int i=0;i<nums.length;i++){
                if(!freq[i]){
                    freq[i]=true;
                    ds.add(nums[i]);
                    recurPermute(nums,ans,ds,freq);
                    ds.remove(nums.length-1);
                    freq[i]=false;
                }
            }

        }


    }
}
