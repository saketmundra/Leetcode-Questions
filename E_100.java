package com.company;

public class E_100 {
    public static void main(String[] args) {

    }
    class Solution {
        public class TreeNode {
            int val;
            M_1325.TreeNode left;
            M_1325.TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, M_1325.TreeNode left, M_1325.TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
        public boolean isSameTree(M_1325.TreeNode p, M_1325.TreeNode q) {
            if(p==null && q==null) return true;
            if(p==null || q==null) return false;
            if(p.val!=q.val) return false;
            return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);

        }
    }
}
