package com.company;
import java.util.*;

public class E_637 {
    public static void main(String[] args) {

    }
    public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; } }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> qs=new LinkedList<>();
        qs.add(root);
        while (!qs.isEmpty()){
            Queue<TreeNode> ns=new LinkedList<>();
            double ds=0;
            double size=qs.size();
            for(int i=0;i<size;i++){
                TreeNode nd=qs.poll();
                if(nd.left!=null) ns.add(nd.left);
                if(nd.right!=null) ns.add(nd.right);
                ds+=nd.val;
            }
            ans.add(ds/size);
            qs=ns;
        }
        return ans;





    }

}
