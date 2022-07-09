package com.company;
import java.util.ArrayList;
import java.util.List;

public class M_39 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans=new ArrayList<>();
            findcombinations(0,candidates,target,ans,new ArrayList<>());
            return ans;
        }
        public void findcombinations(int idx,int [] arr,int tar,List<List<Integer>>ans,List<Integer>ds){
            if(idx==arr.length){ //base cases
                if(tar==0){
                    ans.add(new ArrayList<>(ds));
                }
                return;
            }

            if(arr[idx]<=tar){ //Case1=When we are taking the same element multiple times
                 ds.add(arr[idx]);//adding element
                 findcombinations(idx,arr,tar-arr[idx],ans,ds);//reducing target
                 ds.remove(ds.size()-1);//removing the last element
            }
            findcombinations(idx+1,arr,tar,ans,ds); //Case2=when we are taking the next element

        }
    }
}
