package com.company;

import java.util.Stack;

public class M_946 {
    public static void main(String[] args) {
        int [] pushed={1,2,3,4,5};
        int [] popped={4,5,3,2,1};



    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> st=new Stack<>();
        int j=0;

        for(int e:pushed){
            st.push(e);
           while(st.size()>0 && st.peek()==popped[j]){
               st.pop();
               j++;
           }
        }
        return j==popped.length;

    }
}
