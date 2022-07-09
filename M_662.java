package com.company;

import java.util.*;


public class M_662 {
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
    class Pair{
        TreeNode node;
        int num;
        Pair(TreeNode _node,int _num){
            node=_node;
            num=_num;
        }
    }
    class Solution {
        public int widthOfBinaryTree(TreeNode root) {
            if(root==null) return 0;
            int ans=0;
            Queue<Pair> qs=new LinkedList<Pair>();
            qs.offer(new Pair(root,0));
            while(!qs.isEmpty()){
                int size=qs.size();
                int mmin= qs.peek().num;
                int first=0;
                int last=0;
                for(int i=0;i<size;i++){
                    int curmin=qs.peek().num=mmin;
                    TreeNode node=qs.peek().node;
                    qs.poll();
                    if(i==0) first=curmin;
                    if(i==size-1) last=curmin;
                    if(node.left!=null) qs.offer(new Pair(node.left,2*curmin+1));
                    if(node.right!=null) qs.offer(new Pair(node.right,2*curmin+2));


                }
                ans=Math.max(ans,last-first+1);





            }
            return ans;
        }
    }
}
