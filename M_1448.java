package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class M_1448 {
    public static void main(String[] args) {

    }
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
    class Solution {

        public int goodNodes(TreeNode root) {
            return goodN(root,Integer.MIN_VALUE);
        }

        public int goodN(TreeNode root,int max) {
            if(root==null) return 0;
            int ans=0;
            if(max<=root.val){
                ans=1;
            }
            max=Math.max(max,root.val);
            int left=goodN(root.left,max);
            int right=goodN(root.right,max);
            ans+=left+right;
            return ans;

        }
    }
}
