package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class E_225 {
    public static void main(String[] args) {

    }
    Queue<Integer> qu=new LinkedList<>();
    public void push(int x) {
        Queue<Integer> nw=new LinkedList<>();
        nw.add(x);
        while(!qu.isEmpty()) {
            nw.add(qu.poll());
        }
        qu=nw;
    }

    public int pop() {
        return qu.poll();
    }

    public int top() {
        return qu.peek();
    }

    public boolean empty() {
        return qu.isEmpty();
    }

}

