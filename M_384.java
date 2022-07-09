package com.company;
import java.util.*;

import java.util.ArrayList;

public class M_384 {
    public static void main(String[] args) {

    }
    class Solution {

        ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<Integer> rese=new ArrayList<>();
        public Solution(int[] nums) {
            for(int i=0;i<nums.length;i++) {
                arr.add(nums[i]);
                rese.add(nums[i]);
            }
        }

        public int[] reset() {
            int [] ans=new int[rese.size()];
            for(int i=0;i<rese.size();i++) {
                ans[i]=rese.get(i);
            }
            return ans;
        }

        public int[] shuffle() {
            Collections.shuffle(arr);
            int [] ans=new int[arr.size()];
            for(int i=0;i<arr.size();i++) {
                ans[i]=arr.get(i);
            }
            return ans;

        }
    }

}
