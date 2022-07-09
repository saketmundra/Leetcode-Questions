package com.company;
import java.util.*;


public class M_61 {
    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
      }
  }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode n=head;
        int size=1;
        while(n.next!=null){
            size++;
            n=n.next;
        }
        n.next=head;
        k=k%size;
        for(int i=0;i<size-k;i++){
            n=n.next;
        }
        head=n.next;
        n.next=null;
        return head;

    }
}
