package com.company;

import java.util.Stack;

public class E_1614 {
    public static void main(String[] args) {

    }
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.add(ch);
                max=Math.max(max,st.size());
            }
            else if(ch==')'){
                st.pop();
            }
        }
        return max;

    }
}
