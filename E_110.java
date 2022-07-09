package com.company;

public class E_110 {
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
        public boolean isBalanced(TreeNode root) {
            return height(root)!=-1;
        }
        public static int height(TreeNode node) {
            if(node==null){
                return 0;
            }
            int lh=height(node.left);
            int rh=height(node.right);
            if(lh==-1 || rh==-1) return -1;
            if(Math.abs(lh-rh)>1) return -1;
            int th=Math.max(lh,rh)+1;
            return th;
        }
    }

}
