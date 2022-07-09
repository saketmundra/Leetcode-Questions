package com.company;

public class E_563 {
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
        private int tilt = 0;

        public int findTilt(TreeNode root) {
            findtilt1(root);
            return tilt;

        }

        public int findtilt1(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int ls = findtilt1(root.left);
            int rs = findtilt1(root.right);

            int ltilt = Math.abs(ls - rs);
            tilt += ltilt;

            int ts = ls + rs + root.val;
            return ts;

        }
    }

}
