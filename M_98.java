package com.company;

public class M_98 {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return find(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean find(TreeNode root,long min,long max){
        if(root == null)
            return true;
        if(root.val>min && root.val<max) {
            return find(root.left,min,root.val) && find(root.right,root.val,max);
        }
        return false;
    }

}
