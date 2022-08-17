package com.company;
import java.util.*;

public class E_1909 {
    public static void main(String[] args) {

    }
    public boolean canBeIncreasing(int[] nums) {
        int p=0;
        int c=1;
        int rem=0;
        while(c<nums.length){
            if(rem>1) return false;
            if(p<0)p+=2;c++;
            if(nums[p]==Integer.MIN_VALUE)p++;
            if(nums[p]>nums[c]){
                rem++;
                nums[p]=Integer.MIN_VALUE;
                p--;
            }
            else{
                c++;
                p++;
            }
        }
        return rem==1;


    }
}
