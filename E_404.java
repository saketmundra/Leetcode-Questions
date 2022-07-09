package com.company;

public class E_404 {
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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root.left==null && root.right==null) return 0;
        if(root.left!=null) return sumOfLeftLeaves1(root,0);
        else return sumOfLeftLeaves1(root,1);

    }
    public int sumOfLeftLeaves1(TreeNode root,int a){
        int sum=0;
        if(root==null) return 0;

        if(root.left==null && root.right==null && a==0){
            sum+=root.val;
            return sum;
        }
        else if(root.left==null && root.right==null && a==1){
            return 0;
        }
        else{
            int left=sumOfLeftLeaves1(root.left,0);
            int right=sumOfLeftLeaves1(root.right,1);
            sum=right+left;
        }
        return sum;
    }
}
