package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ListResourceBundle;

public class E_141 {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head.next==null){
                return false;
            }
            HashSet<ListNode> hs = new HashSet<>();
            ListNode i =head;
            while (!hs.contains(i)){
                if(i.next==null){
                    return false;
                }
                hs.add(i);
                i=i.next;
            }
            return true;

        }
    }
}
