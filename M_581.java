package com.company;
import java.util.*;

public class M_581 {
    public static void main(String[] args) {

    }
    public int findUnsortedSubarray(int[] nums) {
        int [] narr=nums;
        Arrays.sort(narr);

        int st=0;
        int en=nums.length-1;
        while(nums[st]==narr[st] && nums[en]==narr[en] ){
            if(nums[st]==narr[st]){
                st++;
            }
            if(nums[en]==narr[en]){
                en--;
            }
        }
        return en-st+1;

    }
}
