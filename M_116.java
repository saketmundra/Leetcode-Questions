package com.company;
import java.util.*;

public class M_116 {
    public static void main(String[] args) {

    }
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    class Solution {
        public Node connect(Node root) {
            Queue<Node> qs=new LinkedList<>();
            if(root==null) return null;
            qs.add(root);

            while(!qs.isEmpty()) {
                int size=qs.size();
                ArrayList<Node> ns=new ArrayList<>();
                for(int i=0;i<size;i++){
                    if(qs.peek().left!=null) qs.add(qs.peek().left);
                    if(qs.peek().right!=null) qs.add(qs.peek().right);
                    ns.add(qs.poll());
                }
                for(int i=0;i<ns.size()-1;i++){
                    ns.get(i).next=ns.get(i+1);
                }
            }
            return root;
        }
    }
}
