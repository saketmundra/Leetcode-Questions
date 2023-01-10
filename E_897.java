package com.company;

import java.util.ArrayList;

public class E_897 {
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
    ArrayList<TreeNode> a=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        inorder(root);
        TreeNode t=a.get(0);
        TreeNode trav=t;
        int i=1;
        while(i<a.size())
        {
            trav.right=a.get(i);
            trav=trav.right;
            trav.left=null;
            i++;
        }
        return t;
    }
    public void inorder(TreeNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            a.add(root);
            inorder(root.right);
        }
    }


}
