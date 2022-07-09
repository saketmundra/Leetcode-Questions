package com.company;
import java.util.*;

public class E_136 {
    public static void main(String[] args) {
        int []arr={-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};
        System.out.println(singleNumber(arr));

    }
    static int singleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(nums.length == 1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        for(int i=1; i<nums.length; i=i+2){
            if(nums[i]!=nums[i-1]) return nums[i];
        }
        return 0;




    }
}
