package com.company;

public class M_81 {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        int st=0,ed= nums.length-1;
        while (st<=ed){
            int m=st+(ed-st)/2;
            if(target==nums[m]){
                return true;
            }
            else if(nums[st]<nums[m] || nums[m]>nums[ed]){ //if first half is sorted
                if(target>=nums[st] && target<nums[m]){
                    ed=m-1;
                }else {
                    st=m+1;
                }
            }
            else if(nums[ed]>nums[m] || nums[st]>nums[m]){ //if second half is sorted
                if(target<=nums[ed] && target>nums[m]){
                    st=m+1;
                }
                else {
                    ed=m-1;
                }
            }
            else{
                ed--;
            }
        }
        return false;
    }
    public boolean bs(int [] nums,int st, int ed,int target){

    }
}
