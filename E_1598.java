package com.company;

import java.util.Stack;

public class E_1598 {
    public static void main(String[] args) {
        String[] arr={"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(arr));

    }
    public static int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();

        for(int i=0;i<logs.length;i++){
            if(logs[i].contains("../") && !st.isEmpty()){
                st.pop();
            }
            else if(logs[i].contains("./")){
                continue;
            }
            else {
                st.push(logs[i]);
            }
        }
        return st.size();

    }
}
