package com.company;

import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class E_160 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//            ListNode i= headA;
//            ListNode j= headB;
//
//            while(headA!=null){
//                while(headB!=null){
//                    if(i==j){
//                        return j;
//                    }
//                    else{
//                        j=j.next;
//                    }
//                }
//                i=i.next;
//            }
//            return null;

            HashSet<ListNode> set = new HashSet<>();
            ListNode node = headA;
            while (node != null) {
                set.add(node);
                node = node.next;
            }
            node = headB;
            while (node != null) {
                if(set.contains(node)) return node;
                node = node.next;
            }
            return null;





        }
    }
}
