package com.company;

import java.util.List;

public class H_25 {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode sx=head;
        int size=0;
        while (sx!=null){
            sx=sx.next;
            size++;
        }
        size-=(size%k);
        sx=head;
        while(size!=0){
            size--;
            sx=sx.next;
            if(size%k==0){

            }


        }



    }
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;

    }
}
