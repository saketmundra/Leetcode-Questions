package com.company;

import java.util.HashMap;
import java.util.List;

public class M_24 {
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
        public ListNode swapPairs(ListNode head) {
            ListNode dum=new ListNode(-1);
            dum.next=head;
            ListNode pre=dum;
            ListNode curr=head;

            while (curr!=null && curr.next!=null){
                pre.next=curr.next;
                curr.next=curr.next.next;
                pre.next.next=curr;
                curr= curr.next;
                pre=pre.next.next;
            }
            return dum.next;

        }
    }
}
