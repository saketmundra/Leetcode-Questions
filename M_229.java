package com.company;
import java.util.*;

public class M_229 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            double k=(double)nums.length/(double)3;
            List<Integer> result = new ArrayList<Integer>();
            HashMap<Integer,Integer> hs=new HashMap<>();
            for(int i=0;i<nums.length;i++) {
                if(!hs.containsKey(nums[i])){
                    hs.put(nums[i],1);
                    if(1>k){
                        result.add(nums[i]);
                    }
                }else{
                    if(hs.get(nums[i])>k) continue;
                    int o=hs.get(nums[i]);
                    hs.put(nums[i],o+1);
                    if(o+1>k){
                        result.add(nums[i]);
                    }
                }
            }
            return result;



        }
    }

}
