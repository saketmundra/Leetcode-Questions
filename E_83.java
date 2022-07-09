package com.company;

import java.util.HashMap;
import java.util.LinkedList;

public class E_83 {

    public class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fh=head;
        while(fh!=null && fh.next!=null){
            if(fh.val==fh.next.val){
                fh.next=fh.next.next;
            }
            else{
                fh=fh.next;
            }
        }
        return head;
    }

}
