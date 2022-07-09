package com.company;
import java.util.*;

public class M_46 {
    public static void main(String[] args) {

    }
    class Solution {
        private void recurPermute(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
            if(ds.size()==nums.length){
                ans.add(new ArrayList<>(ds));
                return;
            }

            for(int i=0;i<nums.length;i++){
                if(!freq[i]){
                    freq[i]=true;
                    ds.add(nums[i]);
                    recurPermute(nums,ans,ds,freq);
                    ds.remove(ds.size()-1);
                    freq[i]=false;
                }
            }

        }

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans=new LinkedList<>();
            List<Integer> ds=new LinkedList<>();
            boolean freq[]= new boolean[nums.length];
            recurPermute(nums,ans,ds,freq);
            return ans;
        }
    }

}
