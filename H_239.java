package com.company;

import java.util.Stack;

public class H_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //next greater element

        Stack<Integer> st=new Stack<>();
        int[] a=new int[nums.length];
        st.push(nums.length-1);
        a[nums.length-1]=nums.length;

        for(int i=nums.length-2;i>=0;i--){
            //-a+
            while(st.size()>0 && nums[i]>=nums[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                a[i]=nums.length;
            }
            else{
                a[i]=st.peek();
            }
            st.push(i);
        }

        int [] ans=new int[a.length];
        int j=0;
        for(int i=0;i<=nums.length-k;i++){
            if(j<i){
                j=i;
            }
            while (a[j]<i+k){
                j=a[j];
            }
            ans[i]=a[j];
        }
        return ans;




    }
}
