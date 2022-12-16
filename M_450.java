package com.company;

public class M_450 {
    public static void main(String[] args) {

    }
    public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; } }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key)root.right=deleteNode(root.right,key);
        else{
            TreeNode ri=getmin(root.right);
            root.val=ri.val;
            root.right=deleteNode(root.right,ri.val);
        }
        return root;
    }
    private TreeNode getmin(TreeNode root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
}
