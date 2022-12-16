package com.company;

public class M_951 {
    public static void main(String[] args) {

    }
    public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; } }
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return root1==root2;
    }
    public void flip(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null) return;
        if(root1.left.val== root2.right.val && root1.right.val==root2.left.val){
            TreeNode temp=new TreeNode(1,root2.left,null);
            root2.left=root2.right;
            root2.right=temp.left;
        }
        flip(root1.left,root2.left);
        flip(root1.right,root2.right);
    }
}
