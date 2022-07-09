package com.company;

import java.util.HashMap;

public class M_105 {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> hs=new HashMap<Integer, Integer>();
        for(int i=0;i<inorder.length;i++){
            hs.put(inorder[i],i);
        }
        TreeNode root=ans(preorder,0,preorder.length-1,inorder,0, inorder.length-1,hs);
        return root;


    }
    public TreeNode ans(int[] preorder,int prestart,int preend,int[] inorder,
                        int instart,int inend,HashMap<Integer, Integer> hs){
        if(prestart>preend || instart>inend) return  null;

        TreeNode root=new TreeNode(preorder[prestart]);
         int inroot=hs.get(root.val);//index
         int numsleft=inroot-instart; //nums left in preorder

        root.left=ans(preorder,prestart+1,prestart+numsleft,inorder,instart,inroot-1,hs);
        root.right=ans(preorder,prestart+numsleft+1,preend,inorder,inroot+1,inend,hs);

        return root;

    }
}
