package com.company;

public class E_617 {
    public static void main(String[] args) {

    }

    class Solution {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left,TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            mergeTreess(root1,root2);
            return root1;


        }
        public void mergeTreess (TreeNode root1, TreeNode root2){


        }
    }

}
