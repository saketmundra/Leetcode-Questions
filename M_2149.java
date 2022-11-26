package com.company;

public class M_2149 {
    public static void main(String[] args) {

    }
    public int[] rearrangeArray(int[] nums) {
        int i=0,j=0;
        while(i< nums.length){
            if(i%2==0 && nums[i]<0){
                j=i;
                while(nums[j]<0){
                    j++;
                }
                int k=nums[i];
                nums[i]=nums[j];
                nums[j]=k;
            }
            else if(i%2!=0 && nums[i]>0){
                j=i;
                while(nums[j]>0){
                    j++;
                }
                int k=nums[i];
                nums[i]=nums[j];
                nums[j]=k;
            }
            i++;
        }
        return nums;

    }

}
