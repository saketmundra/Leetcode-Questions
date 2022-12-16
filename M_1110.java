package com.company;
import java.util.*;

public class M_1110 {
    public static void main(String[] args) {

    }
    public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; } }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<to_delete.length;i++){
            hs.add(to_delete[i]);
        }
        del(root,hs,ans);

    }
    public void del(TreeNode root,HashSet<Integer> hs,List<TreeNode> ans){
        if()
    }

}
