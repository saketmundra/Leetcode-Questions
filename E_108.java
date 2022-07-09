package com.company;

import com.sun.source.tree.Tree;

public class E_108 {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums,0,nums.length-1);

    }
    public TreeNode construct(int[] arr,int lo,int hi){
        if(lo>hi){
            return null;
        }
        int mid=(lo+hi)/2;
        int data=arr[mid];
        TreeNode right=construct(arr,mid+1,hi);
        TreeNode left=construct(arr,lo,mid-1);
        TreeNode node=new TreeNode(data,left,right);
        return node;
    }
}
