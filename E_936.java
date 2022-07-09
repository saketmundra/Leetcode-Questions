package com.company;

public class E_936 {
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
    static int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        pir(root,low,high);
        int ans=sum;
        sum=0;
        return ans;
    }
    public static void pir(TreeNode node, int d1, int d2) { //print in range
        if(node==null){
            return;
        }
        if(d1<node.val &&d2< node.val){
            pir(node.left,d1,d2);
        }
        else if(d1>node.val&&d2>node.val){
            pir(node.right,d1,d2);
        }
        else {
            pir(node.left,d1,d2);
            sum+=node.val;
            pir(node.right,d1,d2);
        }
    }

}
