package com.company;

public class E_653 {
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
    public static boolean find(TreeNode node,int data){
        if(node==null){
            return false;
        }
        if(data>node.val){
            return find(node.right,data);
        }
        else if(data<node.val){
            return find(node.left,data);
        }
        else{
            return true;
        }

    }
    static boolean ans;
    public static void travelandprint(TreeNode root,TreeNode node,int tar){
        if(node==null){
            return;
        }
        travelandprint(root,node.left,tar);
        int com=tar-node.val;
        if(node.val<com){
            if(find(root,com)==true){
                ans=true;
            }
        }
        travelandprint(root,node.right,tar);
    }
    public boolean findTarget(TreeNode root, int k) {
        travelandprint(root,root,k);
        boolean found=ans;
        ans=false;
        return found;

    }
}
