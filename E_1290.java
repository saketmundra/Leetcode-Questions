package com.company;

public class E_1290 {
    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public int getDecimalValue(ListNode head) {
        //initialising s1 at head.
        ListNode a1=head;
        //creating a new string S.
        String s="";
        //Creating a new loop till the end of the linked list.
        while(a1!=null){
            s=s+a1.val;
            a1=a1.next;
        }
        //converting the string to int.
        return Integer.parseInt(s,2);





    }
}
