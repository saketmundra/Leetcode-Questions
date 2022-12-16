package com.company;

public class M_623 {
    public static void main(String[] args) {

    }
    public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; } }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode r=new TreeNode(val,root,null);
            return r;
        }
        addOne(root,val,depth);
        return root;
    }
    public void addOne(TreeNode root, int val, int depth) {
        if(depth==2){
            TreeNode l=new TreeNode(val,root.left,null);
            TreeNode r=new TreeNode(val,null,root.right);
            root.left=l;
            root.right=r;
        }
        if(root==null ||  depth>2) return;
        addOne(root,val,depth-1);
    }
}
