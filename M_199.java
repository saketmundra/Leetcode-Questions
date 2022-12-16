package com.company;
import java.util.*;

public class M_199 {
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
    public static void main(String[] args) {


    }
    public List<Integer> result=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightSide(root,0);
        return result;
    }
    public void rightSide(TreeNode root,int level) {
        if(root==null)return;
        if(level==result.size()){
            result.add(root.val);
        }
        rightSide(root.right,level+1);
        rightSide(root.left,level+1);

    }

}
