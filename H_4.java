package com.company;

import java.util.ArrayList;

public class H_4 {
    public static void main(String[] args) {

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length){
                arr.add(nums1[i++]);
            }
            if(j<nums2.length){
                arr.add(nums1[j++]);
            }
        }
        if((i+j)%2==0){
            return (arr.get(((i+j)%2)-1)+arr.get(((i+j)%2)))/2;
        }
        else return arr.get(((i+j)%2));

    }
}
