package com.company;
import java.util.*;

public class M_698 {
    public static void main(String[] args) {

    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum= Arrays.stream(nums).sum();
        if(sum%k==1) return false;
        sum=sum/k;
        ans(nums,sum);


    }
    public void ans(int[]nums,int target){


    }
}
