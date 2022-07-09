package com.company;

public class M_230 {
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
    public int kthSmallest(TreeNode root, int k) {
        kth=0;
        kthsmall=0;

        inorder(root,k);
        return kthsmall;

    }
    static int kth=0;
    static int kthsmall=0;
    public static void inorder(TreeNode node,int k)
    {
        if(node == null)
        {
            return ;
        }

        inorder(node.left , k);

        kth++;
        if(kth==k)
        {
            kthsmall=node.val;
        }

        inorder(node.right,k);
    }
}
