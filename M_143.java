package com.company;

import java.util.Stack;

public class M_143 {
    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public void reorderList(ListNode head) {
            Stack<ListNode> st= new Stack<>();
            ListNode hi=head;
            int n=0;
            while(hi!=null){
                st.push(hi);
                n++;
                hi=hi.next;
            }
            hi=head;
            for(int i=0;i<n/2;i++){
                ListNode str=hi.next;

                hi.next=st.peek();
                st.pop().next=str;

                hi=hi.next.next;
            }
            hi.next=null;






        }
    }
}
