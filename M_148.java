package com.company;

import java.util.PriorityQueue;

public class M_148 {
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
        public ListNode sortList(ListNode head) {
            ListNode i=head;
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            while(i!=null){
                pq.add(i.val);
                i=i.next;
            }
            i=head;
            while(i!=null){
                i.val=pq.peek();
                pq.remove();
                i=i.next;
            }
            return head;




        }
    }
}
