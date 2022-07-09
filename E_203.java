package com.company;

public class E_203 {
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
        public ListNode removeElements(ListNode head, int val) {
            if(head==null){
                return null;
            }
            ListNode k=new ListNode(-1);
            k.next=head;
            ListNode i=k;
            while (i!=null){
                if(i.next.val==val){
                    i.next=i.next.next;
                }
                else{
                    i=i.next;
                }
            }
            return k.next;


        }
    }
}
