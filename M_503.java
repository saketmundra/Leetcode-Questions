package com.company;


import java.util.HashMap;
import java.util.Stack;

public class M_503 {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int [] narr=new int [nums.length];

        for(int i=nums.length-1;i>=0;i--){
            while(st.size()>0 && st.peek()<nums[i]){
                st.pop();
            }
            if(st.size()==0){
                narr[i]=-1;
                for(int j=0;j<i;j++){
                    if(nums[j]>nums[i]){
                        narr[i]=nums[j];
                    }
                }

            }
            else {
                narr[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return narr;








    }
}
