package com.company;

import java.util.Stack;

public class E_232 {
    public static void main(String[] args) {

    }
    class MyQueue {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> help=new Stack<>();


        public MyQueue() {

        }

        public void push(int x) {
            while(!st.isEmpty()){
                help.push(st.pop());
            }
            st.push(x);
            while(!help.isEmpty()){
                st.push(help.pop());
            }
        }

        public int pop() {
            return st.pop();
        }

        public int peek() {
            return st.peek();
        }

        public boolean empty() {
            return st.isEmpty();
        }
    }
}
