package com.company;

import java.util.Stack;

public class M_445 {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();

            while (l1 != null) {
                stack1.push(l1.val);
                l1 = l1.next;
            }
            

            while (l2 != null) {
                stack2.push(l2.val);
                l2 = l2.next;
            }

            ListNode result = new ListNode(-1);
            int extra = 0;
            while (!stack1.isEmpty() || !stack2.isEmpty()) {
                int val1 = 0, val2 = 0;
                if (!stack1.isEmpty()) {
                    val1 = stack1.pop();
                }
                if (!stack2.isEmpty()) {
                    val2 = stack2.pop();
                }
                int sum = val1 + val2 + extra;
                if (sum >= 10) {
                    sum = sum % 10;
                    extra = 1;
                } else {
                    extra = 0;
                }

                ListNode tmp = result.next;
                result.next = new ListNode(sum, tmp);

            }

            if (extra == 1) {
                result.val = 1;
                return result;
            } else {
                return result.next;
            }


        }
    }
}
