package com.company;

public class E_905 {
    public static void main(String[] args) {

    }
    public int[] sortArrayByParity(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(e>s){
            if(nums[s]%2==0){
                s++;
            }
            if(nums[e]%2!=0){
                e++;
            }
            else{
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
            }
        }
        return nums;


    }
}
