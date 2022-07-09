package com.company;

import java.util.Stack;

public class E_20 {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()==0){
                st.push(ch);
            }
            else if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.peek()!='('){
                    return false;
                }
                st.pop();
            }
            else if(ch==']'){
                if(st.peek()!='['){
                    return false;
                }
                st.pop();
            }
            else if(ch=='}'){
                if(st.peek()!='{'){
                    return false;
                }
                st.pop();
            }

        }
        if(st.size()==0){
            return true;
        }
        return false;



    }
}
