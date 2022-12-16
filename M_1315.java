package com.company;

public class M_1315 {
    public static void main(String[] args) {

    }
    static int sum=0;
    public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; } }
    public int sumEvenGrandparent(TreeNode root) {
        sum=0;
        sol(root);
        return sum;
    }
    public void sol(TreeNode root){
        if(root==null) return;
        if(root.val%2==0){
            if(root.left!=null){
                if(root.left.left!=null) sum+=root.left.left.val;
                if(root.left.right!=null) sum+=root.left.right.val;
            }
            if(root.right!=null){
                if(root.right.left!=null) sum+=root.right.left.val;
                if(root.right.right!=null) sum+=root.right.right.val;
            }
        }
        sol(root.left);
        sol(root.right);
    }
}
