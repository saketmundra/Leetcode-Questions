package com.company;

import java.util.Stack;

public class H_84 {
    public static void main(String[] args) {

    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int [] rb=new int[n];
        rb[n-1]=n;
        st.push(n-1); //storing index of next smaller element on the right
        for(int i= n-2;i>=0;i--){
            while(st.size()>0 && heights[i]<heights[st.peek()]){
                st.pop();
            }
            if (st.size() == 0) {
                rb[i]=n;
            }
            else{
                rb[i]=st.peek();
            }
            st.push(i);
        }

        st=new Stack<>();
        int [] lb=new int[n];
        lb[0]=-1;
        st.push(0); //storing index of next smaller element on the left
        for(int i=1;i<n;i++){
            while(st.size()>0 && heights[i]<heights[st.peek()]){
                st.pop();
            }
            if (st.size() == 0) {
                lb[i]=-1;
            }
            else{
                lb[i]=st.peek();
            }
            st.push(i);
        }

        //Finding max area
        int max=0;
        for(int i=0;i<n;i++){
            int width=rb[i]-lb[i]-1;
            int area=width*heights[i];
            if(area>max){
                max=area;
            }
        }
        return max;

    }
}
