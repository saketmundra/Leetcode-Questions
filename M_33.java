package com.company;

public class M_33 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l=0;
        int h=nums.length-1;
        while (l<h){
            int m=(l+h)/2;
            if(target==nums[m]){
                return m;
            }
            if(nums[l]<=nums[m]){ //if first half is sorted
                if(target>=nums[l] && target<nums[m]){
                    h=m-1;
                }else {
                    l = m + 1;
                }
            }
            else{ //if second half is sorted
                if(target<=nums[h] && target>nums[m]){
                    l=m+1;
                }
                else {
                    h=m-1;
                }
            }

        }
        return nums[l] == target ? l : -1;
    }
}
