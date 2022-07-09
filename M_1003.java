package com.company;

import java.util.Stack;

public class M_1003 {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='c' && !st.isEmpty() && st.peek()=='b'){
                st.pop();
                if(!st.isEmpty() && st.peek()=='a'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();

    }
}
