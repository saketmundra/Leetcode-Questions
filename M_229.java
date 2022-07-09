package com.company;
import java.util.*;

public class M_229 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            List<Integer> ans=new ArrayList<>();
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(hm.containsKey(nums[i])){
                    int k=hm.get(nums[i]);
                    k++;
                    hm.put(nums[i],k);
                    if(k>nums.length/3){
                        ans.add(nums[i]);

                    }
                }
                else {
                    hm.put(nums[i],1);
                    if(nums.length==2){
                        if(nums[0]==nums[1]){
                            ans.add(nums[0]);
                            return ans;
                        }
                        else{
                            ans.add(nums[0]);
                            ans.add(nums[1]);
                            return ans;
                        }
                    }
                    if(nums.length==1){
                        ans.add(nums[0]);
                        return ans;
                    }
                }
            }
            return ans;



        }
    }

}
