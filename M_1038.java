package com.company;

public class M_1038 {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode bstToGst(TreeNode root) {
        rwsol(root,0);
        return root;
    }
    public static void rwsol(TreeNode node,int sum){
        if(node==null){
            return;
        }
        rwsol(node.right,sum);

        int od=node.val;
        node.val=sum+node.val;
        sum+=od;
        rwsol(node.left,sum+node.val);


    }
}
