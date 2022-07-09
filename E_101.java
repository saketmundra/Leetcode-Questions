package com.company;
import java.util.*;

import java.util.LinkedList;

public class E_101 {
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
        public boolean isSymmetric(TreeNode root) {
             return isSymmetric2(root.left, root.right);
        }
        private boolean isSymmetric2(TreeNode left,TreeNode right) {
            if(left==null && right==null) return true;
            if((left==null && right !=null ) ||(left!=null && right==null)) return false;
            if(left.val == right.val){
               return isSymmetric2(left.left , right.right)
                        && isSymmetric2(left.right , right.left);
            }
            return false;

        }







    }
}
