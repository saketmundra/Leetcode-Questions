package com.company;
import java.util.*;

public class M_102 {
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
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> qs=new LinkedList<>();
            List<List<Integer>> ans=new LinkedList<>();
            if(root==null) return ans;
            qs.add(root);
            while(!qs.isEmpty()){
                int size=qs.size();
                List<Integer> ns=new LinkedList<>();
                for(int i=0;i<size;i++){
                    if(qs.peek().left!=null) qs.add(qs.peek().left);
                    if(qs.peek().right!=null) qs.add(qs.peek().right);
                    ns.add(qs.poll().val);
                }
                ans.add(ns);
            }
            return ans;

        }
    }
}
