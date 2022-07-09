package com.company;

public class M_19 {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next==null){
                return null;
            }
            ListNode start = new ListNode(0);

            ListNode i=start;
            ListNode j=start;
            j.next=head;

            for(int k=0;k<n+1;k++){
                j=j.next;
            }
            while(j!=null){
                i=i.next;
                j=j.next;
            }
            i.next=i.next.next;
            return start.next;







        }

    }
}
