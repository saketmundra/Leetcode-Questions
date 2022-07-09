package com.company;

public class E_226 {
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
        public TreeNode invertTree(TreeNode root) {
            if(root == null) return null;

            TreeNode right1 = invertTree(root.right);
            TreeNode left1 = invertTree(root.left);
            root.right=left1;
            root.left=right1;
            return root;
        }
    }
}
