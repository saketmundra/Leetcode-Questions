package com.company;
import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class E_350 {
    public static void main(String[] args) {

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<>();
        HashMap<Integer, Integer> ht=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(!ht.containsKey(nums1[i])){
                ht.put(nums1[i],1);
            }
            else {
                ht.put(nums1[i],ht.get(nums1[i])+1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(ht.containsKey(nums2[i])){
                if (ht.get(nums2[i])>0){
                    arr.add(nums2[i]);
                    ht.put(nums2[i],(ht.get(nums2[i])-1) );
                }
            }
        }
        int[] ans = new int[arr.size()];
        for (int i=0;i<ans.length;++i){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}
