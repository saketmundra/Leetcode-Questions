package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class M_142 {

     class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            int n=0;
            HashSet<ListNode> hs=new HashSet<>();
            ListNode hi=head;
            while(hi!=null){
                if(!hs.contains(hi)){
                    hs.add(hi);
                } else {
                    return hi;

                }
                hi=hi.next;
            }
            return null;
        }
    }
}
