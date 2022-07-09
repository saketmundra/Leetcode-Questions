package com.company;

import java.util.Stack;

public class M_921 {
    public static void main(String[] args) {

    }
    public int minAddToMakeValid(String s) {
        if(s.isEmpty()){
            return 0;
        }
        Stack<Character> st=new Stack<>();
        int res = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ) {
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    res++;
                }
                else{
                    st.pop();
                }
            }

        }
        return st.size()+res;

    }
}
