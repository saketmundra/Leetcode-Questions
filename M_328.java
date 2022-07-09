package com.company;

public class M_328 {
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
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode i=head,j=head.next,pre=j;
            while(i.next!=null && j.next!=null){
                i.next=j.next;
                i=i.next;
                j.next=i.next;
                j=j.next;
            }
            i.next=pre;
            return head;


        }
    }
}
