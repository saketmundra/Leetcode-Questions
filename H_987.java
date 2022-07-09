package com.company;
import java.util.*;

public class H_987 {
    public static void main(String[] args) {

    }
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        ans(root,0);
        List<List<Integer>> ans=new ArrayList<>(hs.size());
        List<Integer> key=new ArrayList<>(hs.keySet());
        Collections.sort(key);
        for(int i=0;i<key.size();i++){
            ans.add(hs.get(key.get(i)));
        }
        return ans;
    }
    HashMap<Integer, List<Integer>> hs=new HashMap<>();
    public void ans(TreeNode root,int level){
        if(root==null) return;
        ans(root.left,level-1);
        if(hs.containsKey(level)){
            hs.get(level).add(root.val);
        }
        else{
            hs.put(level,new ArrayList<>());
            hs.get(level).add(root.val);
        }
        ans(root.right,level+1);
    }
}
