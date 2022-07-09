package com.company;
import java.util.*;

public class M_437 {
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
        static int ans = 0;
        public int pathSum(TreeNode root, int targetSum) {
            if(root ==null) return 0;
            if(targetSum== root.val){
                ans++;
            }
            int left=pathSum(root.left, targetSum)+pathSum(root.left,targetSum-root.val);
            int right=pathSum(root.right, targetSum)+pathSum(root.right,targetSum-root.val);
            return ans;

        }



















        public int pathSum3(TreeNode root, int targetSum) {
            if(root==null) return 0;
            int ans=pathsum2(root, targetSum,0);
            ans+=pathSum3(root.left,targetSum)+pathSum3(root.right,targetSum);
            return ans;
        }
        public int pathsum2(TreeNode root,int target,int ans){
            if(root ==null) return 0;
            if(target == root.val){
                return 1;
            };

            int left=pathsum2(root.left,target- root.val,ans);
            int right=pathsum2(root.right,target-root.val,ans);
            ans=left+right;
            return ans;
        }
    }


}
