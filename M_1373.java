package com.company;

public class M_1373 {
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
        }}

        public int maxSumBST(TreeNode root) {
        you=0;
        maxSumBST2(root);
        return you;


        }
    static int you=0;
    public void maxSumBST2(TreeNode root) {
        if(root == null) return;
        if(isValidBST(root)){
            you=Math.max(you,sum(root));
        }
        maxSumBST2(root.left);
        maxSumBST2(root.right);
        }
        public int sum(TreeNode root){
            if(root==null) return 0;
            int left=sum(root.left);
            int right=sum(root.right);
            return left+right+ root.val;

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
