package com.company;

import java.util.PriorityQueue;

public class M_530 {
    public static void main(String[] args) {

    }
    class Solution {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        public int getMinimumDifference(TreeNode root) {
            int ans=Integer.MAX_VALUE;
            while(!pq.isEmpty()){
                int a=pq.poll();
                ans=Math.min(ans,pq.peek()-a);
            }
            return ans;
        }
        public void getMinimums(TreeNode root) {
            if(root!=null){
                pq.add(root.val);
            }
            getMinimums(root.left);
            getMinimums(root.right);
        }
    }
}
