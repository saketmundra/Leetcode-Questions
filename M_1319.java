package com.company;
import java.util.*;

public class M_1319 {
    public static void main(String[] args) {

    }
    class DisjointSet {
        List<Integer> parent = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        public DisjointSet(int n) {
            for (int i = 0; i <= n; i++) {
                parent.add(i);
                size.add(1);
            }
        }

        public int findUPar(int node) {
            if (node == parent.get(node)) {
                return node;
            }
            int ulp = findUPar(parent.get(node));
            parent.set(node, ulp);
            return parent.get(node);
        }
        public void unionBySize(int u, int v) {
            int ulp_u = findUPar(u);
            int ulp_v = findUPar(v);
            if (ulp_u == ulp_v) return;
            if (size.get(ulp_u) < size.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
            } else {
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
            }
        }
    }
    class Solution {
        public int makeConnected(int n, int[][] connections) {
            DisjointSet ds=new DisjointSet(n);
            int cnt=0;
            int m=connections.length;
            for(int i=0;i<m;i++){
                int u=connections[i][0];
                int v=connections[i][1];
                if(ds.findUPar(u)==ds.findUPar(v)){
                    cnt++;
                }
                else{
                    ds.unionBySize(u,v);
                }
            }
            int comp=0;
            for(int i=0;i<n;i++){
                if(ds.parent.get(i)==i)comp++;
            }
            if(cnt>=comp-1){
                return comp-1;
            }
            return -1;

        }
    }
}
