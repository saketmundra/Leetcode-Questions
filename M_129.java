package com.company;

public class M_129 {
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
    int sum1=0;
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return sum1;
    }

    public void helper(TreeNode root, int currentNum) {
        if(root == null) {
            return;
        }
        currentNum = (currentNum * 10) + root.val;
        if(root.left == null && root.right == null) {
            sum1 += currentNum;
        } else {
            helper(root.left, currentNum);

        }
    }

}
