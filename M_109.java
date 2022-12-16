package com.company;

import java.util.ArrayList;

public class M_109 {
    public static void main(String[] args) {

    }
    public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; } }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> ar=new ArrayList<>();
        while(head!=null){
            ar.add(head.val);
            head=head.next;
        }
        return sortbst(ar,0,ar.size());
    }
    public TreeNode sortbst(ArrayList<Integer> ar,int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        TreeNode left=sortbst(ar,low,mid-1);
        TreeNode right=sortbst(ar,mid+1,high);
        int data=ar.get(mid);
        TreeNode n=new TreeNode(data,left,right);
        return n;
    }



}
