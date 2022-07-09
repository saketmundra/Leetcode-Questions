package com.company;
import java.util.*;
public class M_863 {
    public static void main(String[] args) {

    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
    class Solution {
        static List<Integer> answ = new ArrayList<Integer>();
        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            List<TreeNode> ntr = solve(root,target.val);
            for(int i=0;i<ntr.size();i++) {
                printKLevelsDown(ntr.get(i),k-i,i==0?null:ntr.get(i));
            }
            return answ;

        }
        private boolean getPath(TreeNode root, ArrayList<TreeNode> ans,int x){
            if(root==null) return false;
            ans.add(root);
            if(root.val==x) return true;
            if(getPath(root.left,ans,x) || getPath(root.right,ans,x)) return true;
            ans.remove(ans.size()-1);
            return false;
        }
        public ArrayList<TreeNode> solve(TreeNode A, int B) {
            ArrayList<TreeNode> ans=new ArrayList<>();
            if(A==null) return ans;
            getPath(A,ans,B);
            return ans;
        }

        public static void printKLevelsDown(TreeNode node, int k,TreeNode blocker){
            if(node==null || k<0 || node==blocker){
                return;
            }
            if(k==0){
                answ.add(node.val);
            }
            printKLevelsDown(node.left,k-1,blocker);
            printKLevelsDown(node.right,k-1,blocker);
        }

    }

}
