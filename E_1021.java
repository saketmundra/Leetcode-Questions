package com.company;

import java.util.Stack;

public class E_1021 {
    public static void main(String[] args) {

    }
    public String removeOuterParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        char [] str=s.toCharArray();

        for(int i=0;i<str.length;i++){
            char ch=str[i];
            if(ch=='('){
                st.push(i);
            }
            else{
                if(st.size()==0){
                    str[i]=0;
            }
                else if(st.size()==1){
                    str[i]=0;
                    str[st.pop()]=0;
                }
                else st.pop();
            }
        }
        while(st.size()>0){
            str[st.pop()]=0;

        }
        StringBuilder sb=new StringBuilder();
        for(char c:str){
            if(c!=0){
                sb.append(c);
            }
        }
        return sb.toString();





    }
}
