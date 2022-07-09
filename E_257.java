package com.company;
import java.util.*;

public class E_257 {
    public static void main(String[] args) {

    }public class TreeNode {
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

        public List<String> binaryTreePaths(TreeNode root) {
            List<String> answer=new ArrayList<String>();
            if(root!=null) binaryTreePath(root,"",answer);
            return answer;
        }
        public void binaryTreePath(TreeNode root,String path,List<String> ans) {
            if(root.left==null && root.right==null){
                ans.add(path+root.val);
            }
            if(root.left!=null){
                binaryTreePath(root.left,path+root.val+"->",ans);
            }if(root.right!=null){
                binaryTreePath(root.right,path+root.val+"->",ans);
            }

        }
    }

}
