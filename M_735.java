package com.company;

import java.util.Stack;

public class M_735 {
    public static void main(String[] args) {

    }
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();
        int i = 0;
        while(i<asteroids.length){
            int asteroid = asteroids[i];
            if(st.isEmpty())
                st.push(asteroid);
            else{
                if(st.peek()>0 && asteroid<0){
                    if(Math.abs(st.peek())==Math.abs(asteroid)){
                        st.pop();
                    }else if(Math.abs(st.peek())<Math.abs(asteroid)){
                        st.pop();
                        continue;
                    }
                }else{
                    st.push(asteroid);
                }
            }
            i++;
        }
        int[] ans = new int[st.size()];
        i = st.size()-1;
        while(!st.isEmpty())
            ans[i--] = st.pop();
        return ans ;
    }
}
