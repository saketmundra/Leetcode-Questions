package com.company;
import java.util.*;

public class E_94 {
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
        private List result=new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            if(root==null){
                return result;
            }

            inorderTraversal(root.left);
            result.add(root.val);
            inorderTraversal(root.right);
            return result;

        }
    }
}
