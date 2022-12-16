package com.company;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class M_2487 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {

    }
    public ListNode removeNodes(ListNode head) {
      Stack<Integer> st=new Stack<>();
      ListNode i=head;
      while (i!=null){
        if(st.isEmpty() || st.peek()>i.val){
          st.push(i.val);
        }
        else{
          while (st.size()>0 && st.peek()<i.val){
            st.pop();
          }
          st.push(i.val);
        }
        i=i.next;
      }
      Stack<Integer> ts=new Stack<>();
      while (!st.empty()){
        ts.push(st.pop());
      }
      ListNode t=new ListNode(ts.pop());
      i=t;
      while (!ts.isEmpty()){
        ListNode s=new ListNode(ts.pop());
        i.next=s;
        i=i.next;
      }
      return t;




    }
}
