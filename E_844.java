package com.company;

import java.util.Stack;

public class E_844 {
    public boolean backspaceCompare(String s, String t) {
        if(str(s).equals(str(t))){
            return true;
        }
        return false;
    }
    public static String str (String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                if(st.size()>0){
                    st.pop();
                }
                else {
                    break;
                }

            }
            st.push(str.charAt(i));

        }
        String res=" ";
        for(int i=0;i<st.size();i++){
            res=res+st.peek();
            st.pop();
        }
        return res;

    }
}
