package com.company;

public class M_2095 {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode sl=head;
        ListNode fs=head;
        while (fs.next!=null && fs.next.next!=null){
            sl=sl.next;
            fs=fs.next.next;
        }
        if(fs.next!=null){
            sl=sl.next;
        }
        if(sl.next==null){
            head.next=null;
            return head;
        }
        sl.val=sl.next.val;
        sl.next=sl.next.next;

        return head;


    }
}
