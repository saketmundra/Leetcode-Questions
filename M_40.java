package com.company;
import java.util.*;

public class M_40 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> hs= new HashSet<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,hs,new ArrayList<>());
        return new ArrayList<>(hs);
    }
    public void findCombinations(int idx,int [] arr,int tar,Set<List<Integer>> hs,List<Integer> ds){
        if(tar<0){
            return;
        }
        if(tar==0 && !hs.contains(ds)){
            hs.add(new ArrayList<>(ds));
        }
        for(int i=idx;i<arr.length;i++){
            ds.add(arr[i]);
            findCombinations(i+1,arr,tar-arr[i],hs,ds);
            ds.remove(ds.size()-1);
        }

    }
}
