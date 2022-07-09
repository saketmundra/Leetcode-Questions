package com.company;

import java.util.HashSet;
import java.util.Stack;

public class E_234 {
    public static void main(String[] args) {

    }


     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode hi=head;
        int n=0;
        while(hi!=null){
            n++;
            hi=hi.next;
        }
        hi=head;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(n%2==0){
                if(i<n/2){
                    st.push(hi.val);
                }
                else {
                    if(st.pop()!=hi.val) return false;
                }

            }
            else {
                if(i<n/2){
                    st.push(hi.val);
                }
                else if(i>n/2) {
                    if(st.pop()!=hi.val) return false;
                }
            }
            hi=hi.next;

        }
        if(st.isEmpty()) return true;
        return false;
    }
}
