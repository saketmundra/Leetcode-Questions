package com.company;

import java.util.Stack;

public class M_856 {
    public static void main(String[] args) {

    }
    public int scoreOfParentheses(String s) {
        if(s.isEmpty()){
            return 0;
        }
        Stack<Character> st=new Stack<>();
        int score=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ) {
                st.push(ch);
            }
            else{
                if(st.isEmpty()) st.push(ch);
                else if(st.peek()=='(') {
                    score++;
                    st.pop();
                }
                else st.push(ch);
            }
        }
        return score;

    }
}
